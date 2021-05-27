package com.bridgelaz.main;


import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome user registration");

    }
    //DECLARE PATTERN
    String firstNamePattern = "^[A-Z][a-z]{2,}$";
    String lastNamePattern = "^[A-Z][a-z]{2,}$";
    String emailPattern = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    String mobileNumber = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$";
    String passwordPatternFirstRule= "^[A-Z][a-zA-Z0-9]{8,}";
   // String passwordPatternSecondRule="^[A-Z][a-zA-Z0-9]{8,}";

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

    //mobile number method
    public boolean isValidPhonemes(String phoneNumber) {
        return (Pattern.matches(mobileNumber,phoneNumber));
    }

    public boolean isValidPassword(String password) {
        return (Pattern.matches(passwordPatternFirstRule,password));
    }
}