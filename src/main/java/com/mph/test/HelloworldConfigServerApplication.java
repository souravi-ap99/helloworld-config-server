package com.mph.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class HelloworldConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldConfigServerApplication.class, args);
	}

}
