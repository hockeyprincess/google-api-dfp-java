# Using the DFP API in Java without the Client Library #

**If you plan to make requests to the DFP API with Java, we recommend you use the DFP API Java client library.**

If you don't wish to use the client library and would rather implement your own solution, this document explains how to get started. The example below uses a Google Account, DFP API v201203, and Axis 1.x .

## Authentication ##

In the the API, authentication is handled using the [ClientLogin API](http://code.google.com/apis/accounts/docs/AuthForInstalledApps.html). It is a REST based API that takes the email and password of a Google account and returns an authentication token that must be included with all requests to the API. The required parameters are:

| accountType | Should always be "GOOGLE" |
|:------------|:--------------------------|
| Email       | The email address of the DFP Google account |
| Passwd      | The password of the account |
| service     | Should always be "gam"    |
| source      | Should be a unique string identifying your application |

A successful response will include a series of tokens, one per line. Only the "Auth" token
is required by the DFP API.
```
SID=DQAAAGgA...7Zg8CTN
LSID=DQAAAGsA...lk8BBbG 
Auth=DQAAAGgA...dk3fA5N
```

A simple client for this API using the Java HttpClient class can be found in the client library class [AuthToken](http://code.google.com/p/google-api-dfp-java/source/browse/trunk/src/com/google/api/ads/dfp/lib/AuthToken.java).

```
// Create authToken.
String authToken = new AuthToken(email, password).getAuthToken();
```

## Wsdl2Java ##

Creating Java POJOs and service clients from the WSDL is relatively straightforward with Wsdl2Java (provided in the distribution of your Axis1 package). Below is snippet of an Ant build script which would create the Java files and map the output correctly for the OrderService.

```
<axis-wsdl2java all="true"
    url="https://www.google.com/apis/ads/publisher/v201203/OrderService?wsdl"
    verbose="true" output="src" debug="false" wrapArrays="true">
  <mapping namespace="https://www.google.com/apis/ads/publisher/v201203"
      package="com.google.api.ads.dfp.v201203" />
</axis-wsdl2java>
```

Notice that wrapArrays is set to true for compatibility with jagged arrays. Notice also that for every service, the cm namespace must be included as common classes such as SoapHeader belong to this.

## Creating a Service Client/Stub ##

For Axis1, the service locator is used to get a stub for the service. Here, serviceUrl represents the URL of the service, usually in the form of:

https://www.google.com/apis/ads/publisher/v201203/OrderService


Below is a snippet of how this may be done. We leave the type as the service interface so that it may be more conveniently used in the future.

```
 // Get the OrderService.
OrderServiceInterface orderService =
    new OrderServiceLocator().getOrderServiceInterfacePort(new URL(serviceUrl));
```

## Setting the Headers ##

The API uses one SOAP header, called "RequestHeader", to hold the various header fields of the request. This header must be created using the SoapHeader class (using the namespace of the service), and the required header fields. The service must first be cast to a Stub before the header can be set.

```
// Set the header.
SoapRequestHeader soapHeader =
    new SoapRequestHeader(authToken, networkCode, applicationName, null);
((Stub) orderService).setHeader(namespace, "RequestHeader", soapHeader);
```

## Making a service call ##

Using the service stub with the headers set, a call to the API can be made. Below is a snippet on how this might be done:
```
// Set the ID of the advertiser to get orders for.
Long advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");

// Create a statement to only select orders for a given advertiser.
Statement filterStatement =
    new Statement("WHERE advertiserId = " + advertiserId + " LIMIT 500", null);

// Get orders by statement.
OrderPage page = orderService.getOrdersByStatement(filterStatement);

if (page.getResults() != null) {
  int i = page.getStartIndex();
  for (Order order : page.getResults()) {
    System.out.println(i + ") Order with ID \""
        + order.getId() + "\", name \"" + order.getName()
        + "\", and advertiser ID \"" + order.getAdvertiserId()
        + "\" was found.");
    i++;
  }
}

System.out.println("Number of results found: " + page.getTotalResultSetSize());
```

## Complete Example ##
```
// Copyright 2010, Google Inc. All Rights Reserved.

package nonlib;

import com.google.api.ads.dfp.lib.AuthToken;
import com.google.api.ads.dfp.v201203.Order;
import com.google.api.ads.dfp.v201203.OrderPage;
import com.google.api.ads.dfp.v201203.OrderServiceInterface;
import com.google.api.ads.dfp.v201203.Statement;
import com.google.api.ads.dfp.v201203.CampaignServiceLocator;
import com.google.api.ads.dfp.v201203.SoapHeader;

import org.apache.axis.client.Stub;

import java.net.URL;

/**
 * This example gets all orders for a given advertiser. The statement retrieves
 * up to the maximum page size limit of 500.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetOrdersByStatementExample {
  public static void main(String[] args) {
    try {
      // Provide DFP login information.
      String email = "INSERT_LOGIN_EMAIL_HERE";
      String password = "INSERT_PASSWORD_HERE";
      String applicationName = "INSERT_COMPANY_NAME: DFP API Java Code Example";

      // Create authToken.
      String authToken = new AuthToken(email, password).getAuthToken();

      String serviceUrl = "https://www.google.com/apis/ads/publisher/v201203/OrderService";
      String namespace = "https://www.google.com/apis/ads/publisher/v201203";

      // Get the OrderService.
      OrderServiceInterface orderService =
          new OrderServiceLocator().getOrderServiceInterfacePort(new URL(serviceUrl));

      // Set the header.
      SoapHeader soapHeader = new SoapHeader(...);
      ((Stub) orderService).setHeader(namespace, "RequestHeader", soapHeader);

      // Set the ID of the advertiser to get orders for.
      Long advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");

      // Create a statement to only select orders for a given advertiser.
      Statement filterStatement =
          new Statement("WHERE advertiserId = " + advertiserId + " LIMIT 500", null);

      // Get orders by statement.
      OrderPage page = orderService.getOrdersByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (Order order : page.getResults()) {
          System.out.println(i + ") Order with ID \""
              + order.getId() + "\", name \"" + order.getName()
              + "\", and advertiser ID \"" + order.getAdvertiserId()
              + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```