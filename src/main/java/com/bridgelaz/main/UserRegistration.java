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
    String passwordPattern = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";


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

    //password method
    public boolean isValidPassword(String password) {
        return (Pattern.matches(passwordPattern,password));
    }
}