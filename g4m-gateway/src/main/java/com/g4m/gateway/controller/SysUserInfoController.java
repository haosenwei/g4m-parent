package com.g4m.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.Api;

@Api(value = "检查模板操作", description = "检查模板操作")
@Controller
public class SysUserInfoController {

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
}
