package com.lakshan.bookingengine.bookingengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages = "com.lakshan.bookingengine.commons.model")
@EnableResourceServer
public class BookingEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingEngineApplication.class, args);
	}

}
