package com.lakshan.bookingengine.bookingengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lakshan.bookingengine.commons.model")
public class BookingEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingEngineApplication.class, args);
	}

}
