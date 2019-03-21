package com.example.junittestapp;

import com.example.junittestapp.validation.InputValidation;

import org.junit.Test;
import static org.junit.Assert.*;

public class InputValidationTest {
    InputValidation inputValidation=new InputValidation();
    @Test
    public void validEmail(){
        assertTrue(inputValidation.checkEmail("ramanuj@gmail.com"));
    }

    @Test
    public void validPassword(){
        assertTrue(inputValidation.passwordValidator("Ramanuj"));
    }
}
