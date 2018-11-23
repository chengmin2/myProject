package com.example.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkaApplication.class, args);
	}

}
