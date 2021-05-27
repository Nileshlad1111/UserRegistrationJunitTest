package com.bridgelaz.main;


import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome user registration");

    }
    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";

    //first name method
    public boolean validateFirstName(String name) {
        return (Pattern.matches(firstNamePattern, name));
    }
}