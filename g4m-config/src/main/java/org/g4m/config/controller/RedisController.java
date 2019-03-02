package org.g4m.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;//操作key-value都是字符串

	@Autowired
	private RedisTemplate<String, String> redisTemplate;


	@RequestMapping("/set")
	@ResponseBody
	public String set(String key,String value) {
		stringRedisTemplate.opsForValue().set(key, value);
		return "OK";
	}

	@RequestMapping("/get")
	@ResponseBody
	public String get(String key) {
		String string = stringRedisTemplate.opsForValue().get(key);
		return string;
	}
	
	@RequestMapping("/gets")
	@ResponseBody
	public String gets(String key) {
		String string = redisTemplate.opsForValue().get(key).toString();
		return string;
	}

	@RequestMapping("/sets")
	@ResponseBody
	public String sets(String key,String value) {
		redisTemplate.opsForValue().set(key, value);
		return "OK";
	}

	@RequestMapping("/geti")
	@ResponseBody
	public String geti(String key) {
		String string = System.getProperty(key);
		return string;
	}
	@RequestMapping("/seti")
	@ResponseBody
	public String seti(String key,String value) {
		String property = System.getProperty(key, value);
		return "OK"+":"+property;
	}
}
