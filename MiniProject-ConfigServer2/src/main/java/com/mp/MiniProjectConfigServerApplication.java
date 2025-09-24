package com.mp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MiniProjectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectConfigServerApplication.class, args);
	}

}
