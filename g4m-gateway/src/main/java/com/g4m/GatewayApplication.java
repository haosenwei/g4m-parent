package com.g4m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@EnableZuulProxy
@RestController
@EnableEurekaClient
public class GatewayApplication {

  @RequestMapping("/test")
  public String home(String name) {
	  System.out.println("---"+name);
	  
    return "Hello World";
  }
  
  @RequestMapping(value="/login",method=RequestMethod.POST)
  public ModelAndView loginPost(){
	return new ModelAndView("login");
  }
  @RequestMapping(value="/login",method=RequestMethod.GET)
  public ModelAndView loginGet(){
	  return new ModelAndView("login");
  }
  @RequestMapping(value="/reg",method=RequestMethod.POST)
  public ModelAndView regPost(){
	  return new ModelAndView("reg");
  }
  @RequestMapping(value="/reg",method=RequestMethod.GET)
  public ModelAndView regGet(){
	  return new ModelAndView("reg");
  }
  

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

}