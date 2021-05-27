package com.bridgelaz.main;


import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome user registration");

    }
    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";
    String lastNamePattern = "^[A-Z][a-z]{2,}$";
    String emailPattern="^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    //first name method
    public boolean validateFirstName(String name) {
        return (Pattern.matches(firstNamePattern, name));
    }

    //last name method
    public boolean validateLastName(String name) {
        return (Pattern.matches(lastNamePattern,name));
    }
    //email method
    public boolean isValidEmail(String Email) {
        return Pattern.matches(emailPattern,Email);
    }
}