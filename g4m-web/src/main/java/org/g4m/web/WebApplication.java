package org.g4m.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class WebApplication {


	@RequestMapping(value="/test")
	public void home(HttpServletRequest request) throws IOException {
		InputStream inputStream = request.getInputStream();
		String a = getString(inputStream);
		System.out.println("---"+a);
	}

	private String getString(InputStream inputStream) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;

		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		while ((line = br.readLine()) != null) {
		    sb.append(line);
		}
		String str = sb.toString();
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
