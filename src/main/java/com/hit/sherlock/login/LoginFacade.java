package com.hit.sherlock.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFacade {

    @RequestMapping("/")
    public String login(){
        return "index";
    }

    @RequestMapping("/productOption")
    public String productOption(){
        return "catalog/productOption";
    }

    @RequestMapping("/productOption/detail")
    public String productOptionDetail(){
        return "catalog/productOptionDetail";
    }
}
