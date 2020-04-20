package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void WhenEmail_IsProvided_ShouldReturnTrue() {
        boolean email = userRegistration.validateEmail( "siddhesh@gmail.com" );
        Assert.assertTrue( email );
    }
    @Test
    public void WhenWrongEmail_IsProvided_ShouldReturnFalse() {
        boolean wrongEmail = userRegistration.validateEmail( "siddheshgmail.com" );
        Assert.assertFalse( wrongEmail );
    }
    @Test
    public void WhenPhoneNumber_IsProvided_ShouldReturnTrue() {
        boolean phoneNumber = userRegistration.validatePhoneNumber( "91 9892378813" );
        Assert.assertTrue( phoneNumber );
    }
    @Test
    public void WhenWrongPhoneNumber_IsProvided_ShouldReturnFalse() {
        boolean wrongPhoneNumber = userRegistration.validatePhoneNumber( " 9892378813" );
        Assert.assertFalse( wrongPhoneNumber );
    }
    @Test
    public void WhenCorrectPassword_IsProvided_ShouldReturnTrue() {
        boolean password = userRegistration.validatePassword( "Siddhesh" );
        Assert.assertTrue( password );
    }

    @Test
    public void WhenWrongPassword_IsProvided_ShouldReturnFalse() {
        boolean WrongPassword = userRegistration.validatePassword( "ssss123" );
        Assert.assertFalse( WrongPassword );
    }
}