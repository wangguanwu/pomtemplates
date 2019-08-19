package com.wgw;

import com.wgw.bean.BaseWgw;
import com.wgw.bean.Wgwuser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Test1 {
    @Autowired
    private ApplicationContext ctx;
    @Before
    public void setup(){

    }
    @Test
    public void getBean1(){
        BaseWgw baseWgw = ctx.getBean(Wgwuser.class);
        System.out.println(baseWgw);
    }
}
