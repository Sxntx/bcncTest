package com.sample.bcnc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sample.bcnc")
public class BcncApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcncApplication.class, args);
	}

}
