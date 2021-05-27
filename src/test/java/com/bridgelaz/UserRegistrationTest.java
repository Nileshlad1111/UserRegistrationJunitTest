package com.bridgelaz;


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
}
