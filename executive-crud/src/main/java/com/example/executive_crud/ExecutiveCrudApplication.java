package com.example.executive_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExecutiveCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecutiveCrudApplication.class, args);
	}

}
