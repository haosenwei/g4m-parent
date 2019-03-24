package com.go4mi.tool;

import org.springframework.context.ApplicationContext;

public class SpringContext {
	private static ApplicationContext applicationContext  ;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	public static void setApplicationContext(ApplicationContext context){
		applicationContext = context;
	}
	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}
}

