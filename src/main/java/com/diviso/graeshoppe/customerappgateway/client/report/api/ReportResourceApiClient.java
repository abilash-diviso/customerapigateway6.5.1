package com.diviso.graeshoppe.customerappgateway.client.report.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.customerappgateway.client.report.ReportClientConfiguration;

@FeignClient(name="${report.name:report}", url="${report.url:dev.ci2.divisosofttech.com:8077/}", configuration = ReportClientConfiguration.class)
public interface ReportResourceApiClient extends ReportResourceApi {
}