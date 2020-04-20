package com.bl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class NameTest {

    public String name;
    public boolean valid;

    UserRegistration userRegistration = new UserRegistration();

    public NameTest(String name, boolean valid) {
        this.name = name;
        this.valid = valid;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][]{
                {"Siddhesh", true},
                {"Siddhesh", true},
                {"Ramesh", true},
                {"siddhesh", false},
                {"ramesh", false},
                {"Thakur", true},
                {"Koli", true},
                {"thakur@", false},
                {"koli@", false},
        } );
    }
    @Test
    public void WhenName_IsProvide_ShouldReturnTrue() {
        boolean correctName = userRegistration.validateName( name );
        if (valid) {
            Assert.assertTrue( correctName );
        } else {
            Assert.assertFalse( correctName );
        }
    }

    @Test
    public void WhenLastName_IsProvide_ShouldReturnAsPerCondition() {
        boolean correctLastName = userRegistration.validateName( name );
        if (valid) {
            Assert.assertTrue( correctLastName );
        } else {
            Assert.assertFalse( correctLastName );
        }
    }
}