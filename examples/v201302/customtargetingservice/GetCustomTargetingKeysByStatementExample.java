// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201302.customtargetingservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201302.StatementBuilder;
import com.google.api.ads.dfp.v201302.CustomTargetingKey;
import com.google.api.ads.dfp.v201302.CustomTargetingKeyPage;
import com.google.api.ads.dfp.v201302.CustomTargetingKeyType;
import com.google.api.ads.dfp.v201302.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.v201302.Statement;

/**
 * This example gets all predefined custom targeting keys. The statement
 * retrieves up to the maximum page size limit of 500. To create custom
 * targeting keys, run CreateCustomTargetingKeysAndValuesExample.java.
 *
 * Tags: CustomTargetingService.getCustomTargetingKeysByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetCustomTargetingKeysByStatementExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomTargetingService.
      CustomTargetingServiceInterface customTargetingService =
          user.getService(DfpService.V201302.CUSTOM_TARGETING_SERVICE);

      // Create a statement to only select predefined custom targeting keys.
      Statement filterStatement = new StatementBuilder("WHERE type = :type LIMIT 500").putValue(
          "type", CustomTargetingKeyType.PREDEFINED.toString()).toStatement();

      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(filterStatement);

      if (page.getResults() != null) {
        int i = page.getStartIndex();
        for (CustomTargetingKey customTargetingKey : page.getResults()) {
          System.out.println(i + ") Custom targeting key with ID \"" + customTargetingKey.getId()
              + "\", name \""
              + customTargetingKey.getName() + "\", and display name \""
              + customTargetingKey.getDisplayName() + "\" was found.");
          i++;
        }
      }

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
