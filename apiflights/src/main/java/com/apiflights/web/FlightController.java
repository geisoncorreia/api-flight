package com.apiflights.web;

import com.apiflights.client.FlightClient;
import com.apiflights.model.FlightDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class FlightController {

    private final FlightClient flightClient;

    @RequestMapping("/flyFrom/{flyFrom}/to/{to}/curr/{curr}/flighter")
    public ResponseEntity<FlightDTO> getFlighter(@PathVariable(value = "flyFrom", required = true) String flyFrom,
                                                 @PathVariable(value = "to", required = true) String to,
                                                 @PathVariable(value = "curr", required = true) String curr) {
        return new ResponseEntity<FlightDTO>(flightClient.getFlightFrom(flyFrom, to, curr), HttpStatus.OK);
    }

    @RequestMapping("/flyFrom/{flyFrom}/to/{to}/curr/{curr}/price")
    public ResponseEntity<BigDecimal> getPrice(@PathVariable(value = "flyFrom", required = true) String flyFrom,
                                               @PathVariable(value = "to", required = true) String to,
                                               @PathVariable(value = "curr", required = true) String curr) {
        return new ResponseEntity<BigDecimal>(flightClient.getPrice(flyFrom, to, curr), HttpStatus.OK);
    }
}
