package com.wgw;

import com.wgw.bean.FreemarkerConfigExtend;
import com.wgw.bean.FreemarkerViewExtend;
import javafx.beans.property.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wgw.controller")
//取代spring-servlet.xml
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    FreeMarkerViewResolver freeMarkerViewResolver;
    @Autowired
    InternalResourceViewResolver internalResourceViewResolver;
    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver(){
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setViewClass(FreemarkerViewExtend.class);
        freeMarkerViewResolver.setContentType("text/html;charset=utf-8");
        freeMarkerViewResolver.setCache(true);
        freeMarkerViewResolver.setPrefix("/WEB-INF/ftl/");
        freeMarkerViewResolver.setSuffix(".ftl");
        freeMarkerViewResolver.setOrder(0);
        return freeMarkerViewResolver;
    }
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setOrder(0);
        return resourceViewResolver;
    }
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurerExtend(){
        FreeMarkerConfigurer freeMarkerConfigurer = new FreemarkerConfigExtend();
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/ftl");
        Properties property = new Properties();
        property.setProperty("template_update_delay","0");
        property.setProperty("default_encoding","UTF-8");
        property.setProperty("locale","zh_CN");
        property.setProperty("boolean_format","true,false");
        property.setProperty("datetime_format","yyyy-MM-dd HH:mm:ss");
        property.setProperty("time_format","HH:mm:ss");
        property.setProperty("classic_compatible","true");
        property.setProperty("template_exception_handler","ignore");

        freeMarkerConfigurer.setFreemarkerSettings(property);
        return freeMarkerConfigurer;
    }
    public void addInterceptors(InterceptorRegistry registry) {

    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(internalResourceViewResolver);
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.
                enable();

    }
}
