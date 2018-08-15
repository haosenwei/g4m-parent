package com.g4m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //如果需要注册倒eureka服务中心的话，启用这个
@EnableZuulProxy
@RestController
public class GatewayApplication {

  @RequestMapping("/test")
  public String home(String a) {
	  System.out.println("---"+a);
	  
    return "Hello World";
  }

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

}