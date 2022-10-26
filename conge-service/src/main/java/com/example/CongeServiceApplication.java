package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//@EnableFeignClients
@SpringBootApplication
@EntityScan(basePackages= {"com.example.entities"})
public class CongeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CongeServiceApplication.class, args);
	}

}
