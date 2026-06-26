package com.tnsif.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Agetest {

        @ParameterizedTest
        @ValueSource(ints= {18,19,7,39,90})
        
        void agetest(int age) {
                boolean result =age>=18;
                
                System.out.println(age+" eligiable :"+result);
                
                //assertTrue(result);
                assertFalse(result);
        }
}

