// Copyright 2010 Google Inc. All Rights Reserved.
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

package v201004.reportservice;

import com.google.api.ads.dfp.lib.DfpService;
import com.google.api.ads.dfp.lib.DfpServiceLogger;
import com.google.api.ads.dfp.lib.DfpUser;
import com.google.api.ads.dfp.lib.utils.v201004.ReportUtils;
import com.google.api.ads.dfp.v201004.Column;
import com.google.api.ads.dfp.v201004.DateRangeType;
import com.google.api.ads.dfp.v201004.Dimension;
import com.google.api.ads.dfp.v201004.ReportJob;
import com.google.api.ads.dfp.v201004.ReportJobStatus;
import com.google.api.ads.dfp.v201004.ReportQuery;
import com.google.api.ads.dfp.v201004.ReportServiceInterface;

/**
 * This example runs a report equal to the "Sales by salespersons report" on the
 * DFP website. To download the report see DownloadReportExample.java. To use
 * the {@link ReportUtils} class, see RunAndDownloadReport.java under
 * /examples/utils.
 */
public class RunSalesReportExample {
  public static void main(String[] args) {
    try {
      // Log SOAP XML request and response.
      DfpServiceLogger.log();

      // Get DfpUser from "~/dfp.properties".
      DfpUser user = new DfpUser();

      // Get the ReportService.
      ReportServiceInterface reportService = user.getService(DfpService.V201004.REPORT_SERVICE);

      // Create report job.
      ReportJob reportJob = new ReportJob();

      // Create report query.
      ReportQuery reportQuery = new ReportQuery();
      reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);
      reportQuery.setDimensions(new Dimension[] {Dimension.SALESPERSON});
      reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS,
          Column.AD_SERVER_REVENUE, Column.AD_SERVER_AVERAGE_ECPM});
      reportJob.setReportQuery(reportQuery);

      // Run report job.
      reportJob = reportService.runReportJob(reportJob);

      do {
        System.out.println("Report with ID '" + reportJob.getId() + "' is still running.");
        Thread.sleep(30000);
        // Get report job.
        reportJob = reportService.getReportJob(reportJob.getId());
      } while (reportJob.getReportJobStatus() == ReportJobStatus.IN_PROGRESS);

      if (reportJob.getReportJobStatus() == ReportJobStatus.FAILED) {
        System.out.println("Report job with ID '" + reportJob.getId()
            + "' failed to finish successfully.");
      } else {
        System.out.println("Report job with ID '" + reportJob.getId()
            + "' completed successfully.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}