package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void WhenName_IsProvide_ShouldReturnTrue() {
        boolean correctName = userRegistration.validateName( "Siddhesh" );
        Assert.assertTrue( correctName );
    }
    @Test
    public void WhenWrongName_IsProvided_ShouldReturnFalse() {
        boolean wrongName = userRegistration.validateName( "Siddhesh@" );
        Assert.assertFalse( wrongName );
    }
    @Test
    public void WhenLastName_IsProvide_ShouldReturnTrue() {
        boolean correctLastName = userRegistration.validateName( "Thakur" );
        Assert.assertTrue( correctLastName );
    }
    @Test
    public void WhenWrongLastName_IsProvide_ShouldReturnFalse() {
        boolean wrongLastName = userRegistration.validateName( "Thakur@" );
        Assert.assertFalse( wrongLastName );
    }
    @Test
    public void WhenRightEmail_IsProvide_ShouldReturnTrue() {
        boolean rightEmail = userRegistration.validateEmail( "siddd-thakur47@gmail.com" );
        Assert.assertTrue( rightEmail );
    }
    @Test
    public void WhenWrongEmail_IsProvide_ShouldReturnFalse() {
        boolean WrongEmail = userRegistration.validateEmail( "@gmail.com" );
        Assert.assertFalse( WrongEmail );
    }
}