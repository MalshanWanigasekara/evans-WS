package com.example.productservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class EvansWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvansWsApplication.class, args);
	}

}
