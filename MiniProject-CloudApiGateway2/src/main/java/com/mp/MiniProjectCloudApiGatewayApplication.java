package com.mp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class MiniProjectCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectCloudApiGatewayApplication.class, args);
	}

}
