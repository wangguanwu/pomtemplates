package com.wgw;

import com.wgw.bean.BaseWgw;
import com.wgw.bean.Wgwuser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.wgw"},excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = {EnableWebMvc.class})
})

public class SpringConfig {
    @Bean
    public Wgwuser wgwuser(){
        return new Wgwuser();
    }
}
