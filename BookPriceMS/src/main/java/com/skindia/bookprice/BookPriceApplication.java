package com.skindia.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2; 


@SpringBootApplication
@EnableSwagger2
public class BookPriceApplication {
static Logger log=LoggerFactory.getLogger(BookPriceApplication.class);

public static void main(String args[]) {
 log.info(" BookPriceMS - Begin ");
 SpringApplication.run(BookPriceApplication.class, args);
 log.info(" BookPriceMS - End ");
}
}