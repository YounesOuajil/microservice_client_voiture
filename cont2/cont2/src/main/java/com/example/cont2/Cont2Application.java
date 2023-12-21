package com.example.cont2;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Cont2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cont2Application.class, args);
	}

}
