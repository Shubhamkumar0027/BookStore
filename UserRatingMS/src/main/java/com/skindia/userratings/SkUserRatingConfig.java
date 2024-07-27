package com.skindia.userratings;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SkUserRatingConfig implements WebMvcConfigurer {
private ApiInfo getApiDetails() {
return new ApiInfo("SK BookStore- API",
"BookSearchMS- API - part of BookStore", "1.0", "Free to use ",
new Contact("Shubham Kumar", "https://www.skindia.com", "sk@india.com"),
"API Under Free Licence", "https://www.skindia.com");
}
@Bean
public Docket api() {
return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any())
.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build().apiInfo(getApiDetails());
}
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/METAINF/resources/");
registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
}
}