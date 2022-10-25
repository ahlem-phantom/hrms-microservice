package pl.piomin.microservices.position;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients 
@EnableEurekaClient
public class PositionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PositionSpringBootApplication.class, args);
	}
}