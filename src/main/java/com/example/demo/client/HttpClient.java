package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClient {

    private final RestTemplate restTemplate;

    @Autowired
    public HttpClient(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void makeGetRequest(){
        //Logic etc
    }

    public void makePostRequest(){
        //Logic etc
    }
}
