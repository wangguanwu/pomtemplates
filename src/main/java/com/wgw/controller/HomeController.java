package com.wgw.controller;

import com.wgw.bean.Wgwuser;
import com.wgw.com.wgw.bean.Animal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@ImportResource("classpath:spring/spring-servlet.xml")
public class HomeController {
    @Resource
    Wgwuser wgwuser;
    private Logger logger = LogManager.getLogger(HomeController.class);
    @RequestMapping("/home")
    public String index(Model model){
        List<Animal> list = new ArrayList<Animal>();
        Animal a1 = new Animal();
        a1.setName("g1");
        a1.setPrice(89);
        Animal a2 = new Animal();
        a2.setPrice(90);
        list.addAll(Arrays.asList(a1,a2));
        model.addAttribute("user","wangguanwu");
        model.addAttribute("animals",list);
        logger.debug("haha");

        return "firstvm";
    }

}
