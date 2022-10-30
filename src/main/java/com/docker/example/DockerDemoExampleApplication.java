package com.docker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoExampleApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "This is Simple message to test docker!";
	}

}
