package com.hnx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.hnx.springcloud"})
@ComponentScan("com.hnx.springcloud")
public class DeptConsumeFeign_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumeFeign_App.class, args);
	}

}
