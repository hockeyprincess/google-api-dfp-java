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

package v201306.creativeservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201306.Creative;
import com.google.api.ads.dfp.v201306.CreativePage;
import com.google.api.ads.dfp.v201306.CreativeServiceInterface;
import com.google.api.ads.dfp.v201306.Statement;

/**
 * This example gets all creatives. To create creatives, run
 * CreateCreativesExample.java.
 *
 * Tags: CreativeService.getCreativesByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllCreativesExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CreativeService.
      CreativeServiceInterface creativeService =
          user.getService(DfpService.V201306.CREATIVE_SERVICE);

      // Set defaults for page and filterStatement.
      CreativePage page = new CreativePage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all creatives.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get creatives by statement.
        page = creativeService.getCreativesByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (Creative creative : page.getResults()) {
            System.out.println(i + ") Creative with ID \"" + creative.getId()
                + "\", name \"" + creative.getName()
                + "\", and type \"" + creative.getCreativeType() + "\" was found.");
            i++;
          }
        }

        offset += 500;
      } while (offset < page.getTotalResultSetSize());

      System.out.println("Number of results found: " + page.getTotalResultSetSize());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
