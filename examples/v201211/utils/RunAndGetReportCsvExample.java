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

package v201211.utils;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.CsvUtils;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.ads.dfp.lib.utils.v201211.DateUtils;
import com.google.api.ads.dfp.lib.utils.v201211.ReportUtils;
import com.google.api.ads.dfp.v201211.Column;
import com.google.api.ads.dfp.v201211.DateRangeType;
import com.google.api.ads.dfp.v201211.Dimension;
import com.google.api.ads.dfp.v201211.ExportFormat;
import com.google.api.ads.dfp.v201211.ReportJob;
import com.google.api.ads.dfp.v201211.ReportQuery;
import com.google.api.ads.dfp.v201211.ReportServiceInterface;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

/**
 * This example runs and gets a report's CSV data synchronously or
 * asynchronously using the {@link ReportUtils} class.
 *
 * Tags: ReportService.runReportJob
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public class RunAndGetReportCsvExample {
  public static void main(String[] args) throws Exception {
    // Log SOAP XML request and response.
    DfpServiceLogger.log();

    // Get DfpUser from "~/dfp.properties".
    DfpUser user = new DfpUser();

    // Get the ReportService.
    ReportServiceInterface reportService = user.getService(DfpService.V201211.REPORT_SERVICE);

    // Create report job.
    ReportJob reportJob = new ReportJob();

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDateRangeType(DateRangeType.CUSTOM_DATE);
    reportQuery.setStartDate(DateUtils.fromString("2011-03-01"));
    reportQuery.setEndDate(DateUtils.today("PST"));
    reportQuery.setDimensions(new Dimension[] {Dimension.ORDER, Dimension.LINE_ITEM});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS,
        Column.AD_SERVER_CLICKS, Column.AD_SERVER_CTR,
        Column.AD_SERVER_CPM_AND_CPC_REVENUE, Column.AD_SERVER_AVERAGE_ECPM});
    reportJob.setReportQuery(reportQuery);

    System.out.println("Running report job.");

    // Run report job.
    long reportJobId = reportService.runReportJob(reportJob).getId();

    final ReportUtils reportUtils = new ReportUtils(reportService, reportJobId);

    // Change to use synchronous or asynchronous downloading.
    boolean useSynchronous = true;

    if (useSynchronous) {
      // Get CSV synchronously.
      try {
        System.out.println("Waiting for report to finish.");
        if (reportUtils.waitForReportReady()) {
          System.out.println("Retrieving CSV...");
          String csvString = reportUtils.getReport(ExportFormat.CSV_DUMP);

          // Get CSV as list of string arrays.
          List<String[]> csv = CsvUtils.getCsvDataArray(new StringReader(csvString), true);

          // Output the csv.
          System.out.println(csvString);
        } else {
          System.out.println("The report failed to schedule.");
        }
      } catch (IOException e) {
        System.out.println("Report did not download for reason: " + e.getMessage());
        e.printStackTrace();
      }
    } else {
      // Get XML asynchronously.
      Thread reportThread = reportUtils.whenReportReady(new ReportCallback() {
        public void onSuccess() {
          try {
            System.out.println("Retrieving CSV...");
            String csvString = reportUtils.getReport(ExportFormat.CSV_DUMP);

            // Get CSV as list of string arrays.
            List<String[]> csv = CsvUtils.getCsvDataArray(new StringReader(csvString), true);

            // Output the csv.
            System.out.println(csvString);
          } catch (IOException e) {
            System.out.println("Report did not download for reason: " + e.getMessage());
            e.printStackTrace();
          }
        }

        public void onInterruption() {
          System.out.println("The report thread was interrupted.");
        }

        public void onFailure() {
          System.out.println("The report failed to schedule.");
        }

        public void onException(Exception e) {
          System.out.println("Report did not download for reason: " + e.getMessage());
          e.printStackTrace();
        }
      });
    }
    System.out.println("Main function completed.");
  }
}
