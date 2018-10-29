package com.example.templeteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TempleteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempleteServiceApplication.class, args);
	}
}
