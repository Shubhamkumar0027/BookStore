package com.skindia.bookstoreweb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
public class SkBookStoreWebConfig implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/myjsps/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/METAINF/resources/webjars/");
	registry.addResourceHandler("/mycss/**").addResourceLocations("classpath:/METAINF/resources/mycss/");
	} 

}