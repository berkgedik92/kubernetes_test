package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static String aa;

	public static void main(String[] args) {
		aa = args[0];
		SpringApplication.run(DemoApplication.class, args);
	}

}
