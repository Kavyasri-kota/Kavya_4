package com.catchup.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatchupApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(CatchupApplication.class, args);
	}

}
