package com.wgw.controller;

import com.wgw.bean.Wgwuser;
import com.wgw.com.wgw.bean.Animal;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Resource
    Wgwuser wgwuser;
    @RequestMapping("/index")
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

        return "index";
    }
}
