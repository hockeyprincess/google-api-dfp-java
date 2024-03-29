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

package v201208.userservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.v201208.Statement;
import com.google.api.ads.dfp.v201208.User;
import com.google.api.ads.dfp.v201208.UserPage;
import com.google.api.ads.dfp.v201208.UserServiceInterface;

/**
 * This example gets all users. To create users, run CreateUsersExample.java.
 *
 * Tags: UserService.getUsersByStatement
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class GetAllUsersExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get UserService.
      UserServiceInterface userService =
          user.getService(DfpService.V201208.USER_SERVICE);

      // Sets defaults for page and filterStatement.
      UserPage page = new UserPage();
      Statement filterStatement = new Statement();
      int offset = 0;

      do {
        // Create a statement to get all users.
        filterStatement.setQuery("LIMIT 500 OFFSET " + offset);

        // Get users by statement.
        page = userService.getUsersByStatement(filterStatement);

        if (page.getResults() != null) {
          int i = page.getStartIndex();
          for (User usr : page.getResults()) {
            System.out.println(i + ") User with ID \"" + usr.getId()
                + "\", email \"" + usr.getEmail()
                + "\", and role \"" + usr.getRoleName() + "\" was found.");
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
