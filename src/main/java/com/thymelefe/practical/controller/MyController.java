package com.thymelefe.practical.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model){
        //putting data in model
        model.addAttribute("name", "Sanjay");
        model.addAttribute("date", new Date().toString());
        System.out.println("Inside about handler..");
       
    //    example
    //     String nameString="abc";
    //    nameString.toUpperCase();


        return "about";
    }
}
