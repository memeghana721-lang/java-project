package com.tnsif.testing;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LoginTestdemo {
@Test
        void loginTest(){
                LoginService l=new LoginService();
                
                boolean result=l.login("Meghana", "890402");
                System.out.println("login status "+result);
                
                assertTrue(result);
                
        }
}