package org.g4m.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);
	@Value("${version}")
	private String version;
	
	@RequestMapping("/")
	@ResponseBody
	public String getVersion() {
		return "version :" + version;
	}
	public static void main(String[] args) {
//		SpringApplication.run(ConfigClientApplication.class, args);
		SpringApplication application = new SpringApplication(ConfigClientApplication.class);
//		Map<String, Object> map = new HashMap<String, Object>();
//		application.setDefaultProperties(map);
		application.run(args);
		logger.info("启动成功");
	}
}
