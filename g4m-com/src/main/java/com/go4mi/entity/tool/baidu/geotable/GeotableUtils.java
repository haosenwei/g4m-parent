package com.go4mi.entity.tool.baidu.geotable;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class GeotableUtils {
	
	private static final String createGeotableUrl ="http://api.map.baidu.com/geodata/v4/geotable/create";
	private static final String getGeotableUrl ="http://api.map.baidu.com/geodata/v4/geotable/list";
	
	private static RestTemplate restTemplate = new RestTemplate();
	/**
	 * 创建数据表
	 */
	public static void createGeotable(String name){
		CreateGeotableParam createGeotableParam = new CreateGeotableParam(name);
		System.out.println(createGeotableParam.toString());
		CreateGeotableResult postForObject = restTemplate.postForObject(createGeotableUrl, new CreateGeotableParam(name), CreateGeotableResult.class);
		System.out.println(postForObject);
	}
	public static void getGeotableList(String name){
		GetGeotableParam getGeotableParam = new GetGeotableParam(name);
//		String postForObject = restTemplate.postForObject(getGeotableUrl, getGeotableParam, String.class);
		MultiValueMap<String, String> requestEntity = new LinkedMultiValueMap<>();
		requestEntity.add("ak", "5ItF0S5pKdufc2fVBmla8OGebP0wpA6Q");
		ResponseEntity<String> postForEntity = restTemplate.postForEntity(getGeotableUrl,requestEntity, String.class);
		String body = postForEntity.getBody();
		System.out.println(body);
		
		
//		System.out.println(postForObject);
	}
	public static void main(String[] args) {
//		createGeotable("user");
		getGeotableList("user");
	}
}
