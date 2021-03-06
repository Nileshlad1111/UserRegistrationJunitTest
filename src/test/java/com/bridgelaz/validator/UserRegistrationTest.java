package com.bridgelaz.validator;


import com.bridgelaz.main.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration Preregistration = new UserRegistration();

    //first name test cases
    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        String name="Nilesh";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_whenValid_thenReturnFalse() {
        String name="nilesh";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenInvalidFirstLetterUpperCase_ThenReturn() {
        String name="NILESH";
        boolean firstName = Preregistration.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //last name test cases
    @Test
    public void givenLastName_whenValid_thenReturnTrue() {
        String name="Lad";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_whenValid_thenReturnFalse() {
        String name="lad";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenInvalidFirstLetterUpperCase_ThenReturn() {
        String name = "LAD";
        boolean lastName = Preregistration.validateLastName(name);
        Assert.assertFalse(lastName);
    }

    //test cases email
    @Test
    public void givenEmail_WhenValid_ThenReturnTrue() {
        String email = "ladnilesh1994@gmail.com";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturnFalse() {
        String email = "ladnilesh1994@gmail";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturn() {
        String email = "ladnilesh1994@gmail.in.co";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn() {
        String email = "Ladnilesh1994.com";
        boolean emailID = Preregistration.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    //test case mobile number
    @Test
    public void givenPhoneNumber_WhenValid_ThenReturn() {
        String phoneNumber = "+91 8888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertTrue(phoneNumber1);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ThenReturnTrue() {
        String phoneNumber = "8888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertTrue(phoneNumber1);
    }

    @Test
    public void givenPhoneNumberIncomplete_WhenInValid_ThenReturnFalse() {
        String phoneNumber = "88883102";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertFalse(phoneNumber1);
    }

    @Test
    public void givenPhoneNumber_WhenInValid_ThenReturnFalse() {
        String phoneNumber = "918888310299";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertFalse(phoneNumber1);
    }

    @Test
    public void givenPhoneNumberAndWord_WhenInValid_ThenReturnFalse() {
        String phoneNumber = "91888831Nilu";
        boolean  phoneNumber1 = Preregistration.isValidPhonemes(phoneNumber);
        Assert.assertFalse(phoneNumber1);
    }

    //password minimum 8 character
    @Test
    public void givenPassword_WhenValid_ThenReturn() {
        String password = "Rajkumar@Don.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordNumber_WhenValid_ThenReturn() {
        String password = "NILESHLAD@.12345.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordNumberCharters_WhenInValid_ThenReturnTrue() {
        String password = "Nilesh12345%@.co.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPassword_WhenInValid_ThenReturn() {
        String password = "nilesh";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    @Test
    public void givenPasswordNumber_WhenInValid_ThenReturn() {
        String password = "1245";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    @Test
    public void givenPasswordNumberCharters_WhenInValid_ThenReturnFalse() {
        String password = "1245Nil";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    //password at list one upper case
    @Test
    public void givenPasswordUpperCaseCharters_WhenValid_ThenReturnTrue() {
        String password = "12345NILESH";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    @Test
    public void givenPasswordUpperCaseCharters_WhenInValid_ThenReturnFalse() {
        String password = "NILESH";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    //password at list one numeric
    @Test
    public void givenPasswordNumeric_WhenValid_ThenReturnTrue() {
        String password = "NILESH1@GMAIL.COM";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordAtList_OneNumeric_WhenValid_ThenReturnTrue() {
        String password = "Nilesh1994@.com.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordNumeric_WhenInValid_ThenReturnFalse() {
        String password = "1234NIL";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    @Test
    public void givenPasswordAtList_OneNumeric_WhenInValid_ThenReturnFalse() {
        String password = "Nilesh19";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    //password at list one numeric
    @Test
    public void givenPasswordSpecialCharacter_WhenValid_ThenReturnTrue() {
        String password = "NILESH@GMAIL.COM";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordAtList_OneSpecialCharacter_WhenValid_ThenReturnTrue() {
        String password = "NILESH@GMAIL.COM.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertTrue(password1);
    }

    @Test
    public void givenPasswordSpecialCharacter_WhenValid_ThenReturnFalse() {
        String password = "nil@.in";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }

    @Test
    public void givenPasswordAtList_OneSpecialCharacter_WhenValid_ThenReturnFalse() {
        String password = "NIL@.COM";
        boolean  password1 = Preregistration.isValidPassword(password);
        Assert.assertFalse(password1);
    }
}
