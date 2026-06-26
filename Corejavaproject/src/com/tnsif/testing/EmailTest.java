package com.tnsif.testing;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


//checking multiple customer users
public class EmailTest {

        
        @ParameterizedTest
        @ValueSource(strings= {
                        "usergamil.com",
                        "rashmi@gmail.com",
                        "memeghana721@gmail.com"
                        
        })
        void emailtest(String email) {
                boolean result=email.contains("@");
                
                System.out.println(email+" :"+result);
                
                assertTrue(result);
        }
        
        
}
