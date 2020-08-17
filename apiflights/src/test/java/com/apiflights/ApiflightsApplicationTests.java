package com.apiflights;

import com.apiflights.client.FlightClient;
import com.apiflights.model.FlightDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ApiflightsApplicationTests {

	@Autowired
	FlightClient client;

	@Test
	void contextLoads() {
	}

	@Test
	void getById() {
		FlightDTO flightDTO = client.getFlightFrom("OPO", "FOR", "BR");
		assertNotNull(flightDTO.getSearch_id());
		assertNotNull(flightDTO.getData());
	}

	@Test
	void getPrice() {
		FlightDTO flightDTO = client.getFlightFrom("OPO", "FOR", "BR");
		assertNotNull(Arrays.stream(flightDTO.getData()).findFirst().get().getPrice());
	}

}
