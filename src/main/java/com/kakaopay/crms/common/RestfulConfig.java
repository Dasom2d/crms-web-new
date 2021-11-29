package com.kakaopay.crms.common;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Configuration
public class RestfulConfig {

    private final int READ_TIMEOUT = 5000;
    private final int CONNECT_TIMEOUT = 5000;
    private final int MAX_CONN_TOTAL = 5000;
    private final int MAX_CONN_PER_ROUTE = 5000;


    @Bean
    public RestTemplate restTemplate() {

        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(READ_TIMEOUT);
        factory.setConnectTimeout(CONNECT_TIMEOUT);

        HttpClient httpClient = HttpClientBuilder.create()
                .setMaxConnTotal(MAX_CONN_TOTAL)
                .setMaxConnPerRoute(MAX_CONN_PER_ROUTE)
                .build();

        factory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(factory);

        return restTemplate;
    }
}
