package com.tnsif.testing;


//atm balance calculations

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ATMTest {
      
      @Test
      void withdrawTest() {
              int balance=10000;
              int withdraw=3000;
              
              int remaining =balance-withdraw;
              
              System.out.println("remaining balance: "+remaining);
              
              assertEquals(9000, remaining);
      }

}

