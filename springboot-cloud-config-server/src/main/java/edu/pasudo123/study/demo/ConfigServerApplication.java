package edu.pasudo123.study.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://docs.spring.io/spring-cloud-config/docs/3.0.0/reference/html/#_spring_cloud_config_server
 */
@SpringBootApplication
@RestController
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello spring-cloud-server";
	}
}
