package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBoot01Application {
	@GetMapping("/")
	public String getMsg() {
		return "well come to springboot programming world!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01Application.class, args);
	}

}
