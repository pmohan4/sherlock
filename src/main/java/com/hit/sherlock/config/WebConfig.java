package com.hit.sherlock.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.spring4.SpringTemplateEngine;

@Configuration
public class WebConfig {

    @Autowired
    private AppPropertyConfig appPropertyConfig;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .rootUri(appPropertyConfig.remoteEcomRootUrl)
                .build();
    }

    @Bean
    public LayoutDialect layoutDialect() {
       return new LayoutDialect();
    }
}
