package com.apiflights.web;

import com.apiflights.client.FlightClient;
import com.apiflights.model.FlightDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class FlightController {

    private final FlightClient flightClient;

    @RequestMapping("/flyFrom/{flyFrom}/to/{to}/flighter")
    public ResponseEntity<FlightDTO> getFlighter(@PathVariable("flyFrom") String flyFrom,
                                             @PathVariable("to") String to) {
        return new ResponseEntity<FlightDTO>(flightClient.getFlightFrom(flyFrom, to), HttpStatus.OK);
    }
}
