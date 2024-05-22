package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.controller"})
@EnableWebMvc
public class VigneshConfig extends WebMvcConfigurationSupport{
	
	@Bean
	public InternalResourceViewResolver internview() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/META-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
