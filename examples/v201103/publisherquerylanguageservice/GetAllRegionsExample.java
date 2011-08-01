// Copyright 2011 Google Inc. All Rights Reserved.
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


package v201103.publisherquerylanguageservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201103.PqlUtils;
import com.google.api.ads.dfp.lib.utils.v201103.StatementBuilder;
import com.google.api.ads.dfp.v201103.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.v201103.ResultSet;

/**
 * This example gets all regions available to target.
 *
 * Tags: PublisherQueryLanguageService.select
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllRegionsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the PublisherQueryLanguageService.
      PublisherQueryLanguageServiceInterface pqlService =
          user.getService(DfpService.V201103.PUBLISHER_QUERY_LANGUAGE_SERVICE);

      // Create statement to select all targetable regions.
      StatementBuilder statementBuilder =
          new StatementBuilder("SELECT * FROM Region WHERE targetable = true");

      // Get all regions.
      ResultSet resultSet = pqlService.select(statementBuilder.toStatement());

      // Display results.
      System.out.println(PqlUtils.resultSetToString(resultSet));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}