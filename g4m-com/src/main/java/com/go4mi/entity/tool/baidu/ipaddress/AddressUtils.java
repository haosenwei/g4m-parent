package com.go4mi.entity.tool.baidu.ipaddress;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.client.RestTemplate;

public class AddressUtils {

	public static final String ipUrl= "http://api.map.baidu.com/location/ip?ak=5ItF0S5pKdufc2fVBmla8OGebP0wpA6Q";
	public static BaiduAddress getAddress(String ip){
		RestTemplate restTemplate=new RestTemplate();
		if(StringUtils.isNotBlank(ip)){
			BaiduAddress baiduAddress = restTemplate.getForObject(ipUrl+"&ip="+ip, BaiduAddress.class);
			return baiduAddress;
		}else{
			BaiduAddress baiduAddress = restTemplate.getForObject(ipUrl, BaiduAddress.class);
			return baiduAddress;
		}
	}
	public static BaiduAddress getAddress(){
		return getAddress(null);
	}
}
