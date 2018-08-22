package org.g4m.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class WebApplication {


	@RequestMapping("/test")
	public String home(String a) {
		System.out.println("---"+a);
		return "Hello World"+a;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
