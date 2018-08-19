package org.g4m.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient //如果需要注册倒eureka服务中心的话，启用这个
@RestController
public class WebApplication {

	@Value("${version}") // git配置文件里的key
	private String version ;

	@RequestMapping("/test")
	public String home(String a) {
		System.out.println("---"+a);

		return "Hello World"+version;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
