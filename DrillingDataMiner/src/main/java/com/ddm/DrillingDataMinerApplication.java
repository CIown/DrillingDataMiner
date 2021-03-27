package com.ddm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ddm.*"})
public class DrillingDataMinerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrillingDataMinerApplication.class, args);
	}

}
