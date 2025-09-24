package com.mp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer

public class MiniProjectAdminServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(MiniProjectAdminServerApplication.class, args);
	}

}
