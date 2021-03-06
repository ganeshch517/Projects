package com.cognizant.webservice;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
public class WebPortalApplication implements ServletContextInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WebPortalApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.getSessionCookieConfig().setName("PmsSession");
	}

}
