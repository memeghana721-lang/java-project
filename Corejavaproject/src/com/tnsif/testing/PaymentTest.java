package com.tnsif.testing;


//UPI or payment gateway testing

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class PaymentTest {
      
      @RepeatedTest(5)
      
      void paymentTest() {
              
              boolean server=true;
              System.out.println("payment server :"+server);
              
              assertTrue(server);
      }

}

