package com.example.junittestapp.validation;

public class InputValidation {
    public boolean checkEmail(String email){
        String regex="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(email.matches(regex)){
            return true;
        }else {
            return false;
        }
    }

    public boolean passwordValidator(String password) {
        return password.length() > 5;
    }

}
