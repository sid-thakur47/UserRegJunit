package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void WhenName_IsProvide_ShouldReturnTrue() {
        boolean correctResult = userRegistration.validateName( "Siddhesh" );
        Assert.assertTrue( correctResult );
    }
    @Test
    public void WhenWrongName_IsProvided_ShouldReturnFalse() {
        boolean wrongResult=userRegistration.validateName("Siddhesh@" );
        Assert.assertFalse( wrongResult );
    }
}