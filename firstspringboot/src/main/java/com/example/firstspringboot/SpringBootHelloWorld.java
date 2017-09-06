package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shailendra Yadav
 *
 */
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {

	@RequestMapping("/")
	String home() {
		return "Hello World!....";
	}

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootHelloWorld.class, args);
	}
	
}
