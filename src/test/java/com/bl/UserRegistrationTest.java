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
    public void WhenPhoneNumber_IsProvided_ShouldReturnTrue() {
        boolean phoneNumber = userRegistration.validatePhoneNumber( "91 9892378813" );
        Assert.assertTrue( phoneNumber );
    }
}
