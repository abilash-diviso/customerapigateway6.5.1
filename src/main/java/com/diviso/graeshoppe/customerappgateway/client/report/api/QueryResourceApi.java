/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.report.api;

import com.diviso.graeshoppe.customerappgateway.client.report.model.OrderAggregator;
import com.diviso.graeshoppe.customerappgateway.client.report.model.ReportSummary;
import io.swagger.annotations.*;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

@Api(value = "QueryResource", description = "the QueryResource API")
public interface QueryResourceApi {

    @ApiOperation(value = "createReportSummary", nickname = "createReportSummaryUsingGET", notes = "", response = ReportSummary.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReportSummary.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/report/{date}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReportSummary> createReportSummaryUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") LocalDate date,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getOrderAggregator", nickname = "getOrderAggregatorUsingGET", notes = "", response = OrderAggregator.class, tags={ "query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderAggregator.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/orderAggregator/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderAggregator> getOrderAggregatorUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);

}