package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//@EnableFeignClients
@SpringBootApplication
public class ContratServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ContratServiceApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8080"));
		app.run(args);
		//SpringApplication.run(ContratServiceApplication.class, args);
	}

}
