package com.example.todo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TodoApplication {

	@Value("${NAME:World}")
	String name;

	@RestController
	class HelloWorldController {
		@GetMapping("/")
		String hello() {
			return "hello" + name;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
