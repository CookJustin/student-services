package com.in28minutes.springboot.web.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {
    Accounts acc = new Accounts();

    @Test
    public void testValidLogin(){
        assertTrue(acc.isValidAccount("in28minutes","password"));
    }
    @Test
    public void testInvalidValidLogin(){
        Accounts acc = new Accounts();
        assertFalse(acc.isValidAccount("in28minutes","NotValidPassword"));
    }
    @Test
    public void testCreateAccount(){
        acc.createAccount("Justin", "password");
        assertTrue(acc.isValidAccount("Justin","password"));
    }

}