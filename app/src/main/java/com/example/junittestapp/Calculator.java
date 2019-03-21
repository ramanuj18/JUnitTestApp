package com.example.junittestapp;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class Calculator {

   public Calculator(){
       System.out.println("calculator object created");
   }

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }


}
