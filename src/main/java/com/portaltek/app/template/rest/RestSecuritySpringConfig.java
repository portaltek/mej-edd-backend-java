package com.portaltek.app.template.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.portaltek.app.template.rest" })
public class RestSecuritySpringConfig {

	@Bean
	public String initString() {
		String s = "Hello World";
		System.out.println(s);
		return s;
	}

}