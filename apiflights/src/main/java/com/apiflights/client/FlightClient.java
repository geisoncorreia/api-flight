package com.apiflights.client;

import com.apiflights.model.FlightDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
@ConfigurationProperties(value = "skypicker", ignoreInvalidFields = false)
public class FlightClient {

    public final String PATH_V1 = "&partner=picky&curr=EUR";

    private String apihost;
    private final RestTemplate restTemplate;

    public FlightClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public FlightDTO getFlightFrom(String flyFrom, String to) {
    String params = "?flyFrom="+flyFrom+"&to="+to;
        return restTemplate.getForObject(apihost + params + PATH_V1, FlightDTO.class);
    }

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }
}
