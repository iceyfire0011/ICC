package com.icc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/country")
public class CountryController{
    @GetMapping("/index")
    public String getCountry(){
        return "country/index";
    }
}
