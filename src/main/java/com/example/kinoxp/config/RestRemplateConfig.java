package com.example.kinoxp.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class RestRemplateConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        System.out.println("builder en rest");
        return builder.build();
    }


}
