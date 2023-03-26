package com.example.RestfulfitnessAPImakeathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.RestfulFitnessAPImakeathon")
public class RestfulFitnessApiMakeAThonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulFitnessApiMakeAThonApplication.class, args);
	}

}
