package com.example.demo.service;

import com.example.demo.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    //I want this one to be configured with URL ONE
    private final HttpClient httpClient;

    @Autowired
    public ServiceOne(final HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void makeGetRequest(){
        httpClient.makeGetRequest();
    }

    public void makePostRequest(){
        httpClient.makeGetRequest();
    }
}
