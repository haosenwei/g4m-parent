package org.g4m.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class ConfigServerApplication {

	@Value("${version}")
	private String version;
	
	@RequestMapping("/")
	public String getVersion() {
		return "version :" + version ;
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
