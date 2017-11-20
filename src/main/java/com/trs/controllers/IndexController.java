package com.trs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class IndexController {
    @RequestMapping("/")
    public  String showIndex(){
        return "index";
    }
}
