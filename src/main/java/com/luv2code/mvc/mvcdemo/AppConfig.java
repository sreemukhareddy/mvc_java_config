package com.luv2code.mvc.mvcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer{
 
 
     @Bean
     public InternalResourceViewResolver viewResolver(){
              InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
              viewResolver.setViewClass(JstlView.class);
              viewResolver.setPrefix("/WEB-INF/view/");
              viewResolver.setSuffix(".jsp");
              return viewResolver;
      }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
 
 


}