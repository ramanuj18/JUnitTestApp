package com.example.junittestapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    static Calculator calculator=null;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class called");
    }
    @Before
    public void setUp(){
        System.out.println("setup called");
        calculator=new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(5,calculator.add(3,2));
    }
   // @Ignore("why Disable")
    @Test
    public void testSub(){
        assertEquals(3,calculator.sub(7,4));
    }
    @After
    public void reset(){
        System.out.println("reset called");
        calculator=null;
    }
    @AfterClass
    public static void afterClass(){                    //we can also write annotation many time.
        if(calculator==null) {
            System.out.println("after class called");
        }
    }
}
