package com.in28minutes.springboot.web.controller;


import com.in28minutes.springboot.web.model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
@Controller
@SessionAttributes("name")
public class AccountController {
    @Autowired
    private Accounts accounts;
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "register";
    }
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String createAccount(ModelMap model, @RequestParam String name, @RequestParam String password){
        //TODO: add account to some database or something

        if(accounts.createAccount(name,password)){
            System.out.println("account created");
            return "welcome";
        }
        System.out.println("username already exists");
        return "register";
    }
}
