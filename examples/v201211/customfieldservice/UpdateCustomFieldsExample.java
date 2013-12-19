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

package v201211.customfieldservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201211.CustomField;
import com.google.api.ads.dfp.v201211.CustomFieldServiceInterface;

/**
 * This example updates custom field descriptions. To determine which custom
 * fields exist, run GetAllCustomFieldsExample.java.
 *
 * Tags: CustomFieldService.updateCustomFields
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class UpdateCustomFieldsExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the CustomFieldService.
      CustomFieldServiceInterface customFieldService =
          user.getService(DfpService.V201211.CUSTOM_FIELD_SERVICE);

      // Set the ID of the custom field to update.
      Long customFieldId = Long.parseLong("INSERT_CUSTOM_FIELD_ID_HERE");

      // Get the custom field.
      CustomField customField = customFieldService.getCustomField(customFieldId);

      if (customField != null) {
        customField.setDescription(customField.getDescription() == null ? "" : customField
            .getDescription() + " Updated");

        // Update the custom field on the server.
        CustomField[] customFields =
            customFieldService.updateCustomFields(new CustomField[] {customField});

        // Display results
        if (customFields != null) {
          for (CustomField updatedCustomField : customFields) {
            System.out.println("Custom field with ID \"" + updatedCustomField.getId()
                + "\", name \"" + updatedCustomField.getName() + "\", and description \""
                + updatedCustomField.getDescription() + "\" was updated.");
          }
        } else {
          System.out.println("No custom fields were updated.");
        }
      } else {
        System.out.println("No custom fields found to update.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}