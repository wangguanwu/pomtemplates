package com.wgw;

import com.wgw.bean.Wgwuser;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ImportResource(locations = "classpath:spring/applicationContext.xml")
@ComponentScan(basePackages = {"com.wgw"},excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION,value = {EnableWebMvc.class})
})

public class SpringConfig {

    @Bean
    public Wgwuser wgwuser() {
        return new Wgwuser();
    }
}

