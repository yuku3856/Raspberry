package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controller.Sample;

@SpringBootApplication
public class RaspberryApplication {

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.getMessage());
		SpringApplication.run(RaspberryApplication.class, args);
	}
	
//	public SpringApplication commandLineRunner (Sample sample) {
//		return System.out.println(sample.getMessage());
//	}
}
