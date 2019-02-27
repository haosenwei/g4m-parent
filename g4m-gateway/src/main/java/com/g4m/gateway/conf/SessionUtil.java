package com.g4m.gateway.conf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class SessionUtil {
	public HttpSession getSession(){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		//已经拿到session,就可以拿到session中保存的用户信息了。
		return request.getSession();
	}
	public Object getObject(String name){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		//已经拿到session,就可以拿到session中保存的用户信息了。
		return request.getSession().getAttribute(name);
	}
}
