package com.in28minutes.springboot.web.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class Accounts {

    private HashMap<String, String> accounts = new HashMap<>();
    public Accounts(){
        accounts.put("in28minutes","password");
        accounts.put("Admin","Admin");
    }
    public Accounts accounts(){
        return new Accounts();
    }
    public boolean isValidAccount(String user, String pass){
        if(accounts.get(user).equals(pass)){
            return true;
        }
        else return false;
    }
    public boolean createAccount(String user, String pass){
        if(accounts.containsKey(user)){
            return false;
        }
        else {
            accounts.put(user, pass);
            return true;
        }
    }
}
