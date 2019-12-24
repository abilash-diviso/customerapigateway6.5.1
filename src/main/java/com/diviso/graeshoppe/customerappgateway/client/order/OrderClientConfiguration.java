package com.diviso.graeshoppe.customerappgateway.client.order;

//import com.diviso.graeshoppe.customerappgateway.client.ExcludeFromComponentScan;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ExcludeFromComponentScan
@EnableConfigurationProperties
public class OrderClientConfiguration {

}
