package com.example.junittestapp;

import com.example.junittestapp.mockitotest.CalculatorService;
import com.example.junittestapp.mockitotest.MyCalculator;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

public class MockCalculatorTest {
    CalculatorService service=Mockito.mock(CalculatorService.class);
    MyCalculator calculator;

    @Before
    public void setUp(){
      calculator=new MyCalculator(service);
    }

    @Test
    public void testCalculation(){
        when(service.add(2,3)).thenReturn(5);
        assertEquals(10,calculator.perform(2,3));
        verify(service).add(2,3);
    }
}
