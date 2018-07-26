package com.infosys.itinerary.itinerary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.infosys.itinerary.itinerary.repository")
@SpringBootApplication
public class ItineraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItineraryApplication.class, args);
	}
}
