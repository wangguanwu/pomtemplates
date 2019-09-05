package com.wgw;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
//@ComponentScan(basePackages = "com.wgw.controller")
//取代spring-servlet.xml
//@ImportResource(locations = "classpath:spring/spring-servlet.xml")
public class MvcConfig {


    @Bean
    public VelocityViewResolver velocityViewResolver(){
        VelocityViewResolver velocityViewResolver = new VelocityViewResolver();
        velocityViewResolver.setCache(true);
        velocityViewResolver.setPrefix("");
        velocityViewResolver.setSuffix(".vm");
        velocityViewResolver.setDateToolAttribute("date");
        velocityViewResolver.setNumberToolAttribute("number");
        velocityViewResolver.setContentType("text/html;charset=UTF-8");
        velocityViewResolver.setExposeSpringMacroHelpers(true);
        velocityViewResolver.setExposeRequestAttributes(true);
        velocityViewResolver.setRequestContextAttribute("rc");
        velocityViewResolver.setToolboxConfigLocation("/WEB-INF/classes/config/velocity.xml");
        velocityViewResolver.setOrder(0);
        return velocityViewResolver;

    }
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setOrder(10);
        return resourceViewResolver;
    }
//    @Bean
//    public FreeMarkerConfigurer freeMarkerConfigurerExtend(){
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreemarkerConfigExtend();
//        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/ftl");
//        Properties property = new Properties();
//        property.setProperty("template_update_delay","0");
//        property.setProperty("default_encoding","UTF-8");
//        property.setProperty("locale","zh_CN");
//        property.setProperty("boolean_format","true,false");
//        property.setProperty("datetime_format","yyyy-MM-dd HH:mm:ss");
//        property.setProperty("time_format","HH:mm:ss");
//        property.setProperty("classic_compatible","true");
//        property.setProperty("template_exception_handler","ignore");
//
//        freeMarkerConfigurer.setFreemarkerSettings(property);
//        return freeMarkerConfigurer;
//    }
    @Bean
    public VelocityConfigurer velocityConfigurer() throws IOException {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("/WEB-INF/vm/");
        InputStream in =  Thread.currentThread().getContextClassLoader().getResourceAsStream("config/velocity.properties");
        Properties properties = new Properties();
        properties.load(in);
        velocityConfigurer.setVelocityProperties(properties);
        return velocityConfigurer;
    }

}
