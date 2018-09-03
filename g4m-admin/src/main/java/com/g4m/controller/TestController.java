package com.g4m.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Value("server.port:0")
	private String serverport;
	
	@RequestMapping(value="/a")
	@ResponseBody
	public String a() {
		logger.info("aaa");
		return "hello"+serverport;
	}
	
	@RequestMapping("/log")
	public ModelAndView log(){
		logger.info("aaa");
		return new ModelAndView("log/log");
	}
	@RequestMapping("/home")
	public ModelAndView home(){
		logger.info("home");
		return new ModelAndView("home");
	}
	
}
