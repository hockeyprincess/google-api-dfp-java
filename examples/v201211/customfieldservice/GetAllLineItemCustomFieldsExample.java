// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package v201211.customfieldservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201211.StatementBuilder;
import com.google.api.ads.dfp.v201211.CustomField;
import com.google.api.ads.dfp.v201211.CustomFieldEntityType;
import com.google.api.ads.dfp.v201211.CustomFieldPage;
import com.google.api.ads.dfp.v201211.CustomFieldServiceInterface;
import com.google.api.ads.dfp.v201211.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 * This example gets all custom fields that apply to line items. To create
 * custom fields, run CreateCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.getCustomFieldsByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllLineItemCustomFieldsExample {

  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201211.CUSTOM_FIELD_SERVICE);

      // Create statement to select only custom fields that apply to line items.
      String statementText =
          "WHERE entityType = :entityType LIMIT 500";
      Statement filterStatement =
          new StatementBuilder(statementText)
              .putValue("entityType", CustomFieldEntityType.LINE_ITEM.toString())
              .toStatement();

      // Set defaults for page and offset.
      CustomFieldPage page = new CustomFieldPage();
      int offset = 0;
      int i = 0;
      List<Long> customFieldIds = new ArrayList<Long>();

      do {
        // Create a statement to page through custom fields.
        filterStatement.setQuery(statementText + " OFFSET " + offset);

        // Get custom fields by statement.
        page = customFieldService.getCustomFieldsByStatement(filterStatement);

        if (page.getResults() != null) {
          for (CustomField customField : page.getResults()) {
            System.out.println(i + ") Custom field with ID \""
                + customField.getId() + "\" and name \"" + customField.getName()
                + "\" was found.");
            customFieldIds.add(customField.getId());
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
