package com.hit.sherlock.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFacade {

    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
