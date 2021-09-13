package com.icc.controller;

import com.icc.dto.User;
import com.icc.propertyConstant.CountryConstant;
import com.icc.service.ICountryService;
import com.icc.serviceImpl.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/user")
public class UserController{

    @Autowired
    private ICountryService iCountryService(){
        return new CountryServiceImpl();
    };

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        User user = new User();
        user.setCountryList(iCountryService().getAllCountries());
        model.addAttribute("user", user);
        return "registration";
    }

}
