package com.skindia.userratings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserRatingApplication {
	 static Logger log=LoggerFactory.getLogger(UserRatingApplication.class);

	public static void main(String args[]) {
	 log.info(" UserRatingMS - Begin ");
	 SpringApplication.run(UserRatingApplication.class, args);
	 log.info(" UserRatingMS - End ");
	}
}
