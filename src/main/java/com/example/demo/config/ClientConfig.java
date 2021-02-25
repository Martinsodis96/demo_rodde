package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig {

    @Value("${http-client.urlOne}")
    private String urlOne;

    @Value("${http-client.urlTwo}")
    private String urlTwo;

    @Bean
    @Primary
    public RestTemplate clientOne(){
        return new RestTemplateBuilder().rootUri(urlOne).build();
    }

    @Bean
    @Qualifier("client-two")
    public RestTemplate clientTwo(){
        return new RestTemplateBuilder().rootUri(urlTwo).build();
    }
}
