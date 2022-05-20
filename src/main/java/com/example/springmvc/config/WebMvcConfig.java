package com.example.springmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.annotation.PostConstruct;
import java.util.Collections;

//@EnableWebMvc
//@Configuration
public class WebMvcConfig  {
//    private FreeMarkerConfigurer freeMarkerConfigurer;
//
//    @Autowired
//    public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
//        this.freeMarkerConfigurer = freeMarkerConfigurer;
//    }
//
//    @PostConstruct
//    public void initialized() {
//        this.freeMarkerConfigurer.getTaglibFactory().setClasspathTlds(Collections.singletonList("/META-INF/spring-form.tld"));
//    }
//    @Bean
//    public FreeMarkerConfigurer freemarkerConfig() {
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
//        freeMarkerConfigurer.setTemplateLoaderPath("classpath:/templates/");
//        return freeMarkerConfigurer;
//    }
//    @Bean
//    public FreeMarkerViewResolver freemarkerViewResolver() {
//        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//        resolver.setCache(true);
//        resolver.setPrefix("");
//        resolver.setSuffix(".ftlh");
//        return resolver;
//    }
}
