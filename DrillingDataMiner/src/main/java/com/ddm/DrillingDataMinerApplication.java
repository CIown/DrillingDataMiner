package com.ddm;

import com.ddm.common.annotation.rest.AnonymousGetMapping;
import com.ddm.common.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ddm.*"})
public class DrillingDataMinerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrillingDataMinerApplication.class, args);
	}
	@Bean
	public ServletWebServerFactory webServerFactory() {
		TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
		fa.addConnectorCustomizers(connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
		return fa;
	}

	@Bean
	public SpringContextHolder springContextHolder() {
		return new SpringContextHolder();
	}

	@AnonymousGetMapping("/")
	public String index() {
		return "Backend service started successfully";
	}
}
