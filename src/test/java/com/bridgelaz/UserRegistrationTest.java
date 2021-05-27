package com.bridgelaz;


import com.bridgelaz.main.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration Preregistration = new UserRegistration();

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
}
