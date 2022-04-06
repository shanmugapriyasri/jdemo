package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdemoApplication {
	static Logger log=LoggerFactory.getLogger(JdemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JdemoApplication.class, args);
		log.info("Application started..........");
	}

}
