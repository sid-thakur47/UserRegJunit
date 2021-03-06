package com.bl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class NameValidateTest {

    public String name;
    public boolean valid;

    UserRegistration userRegistration = new UserRegistration();

    public NameValidateTest(String name, boolean valid) {
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
        boolean firstName = userRegistration.validateName( name );
        if (valid) {
            Assert.assertTrue( firstName );
        } else {
            Assert.assertFalse( firstName );
        }
    }

    @Test
    public void WhenLastName_IsProvide_ShouldReturnAsPerCondition() {
        boolean lastName = userRegistration.validateName( name );
        if (valid) {
            Assert.assertTrue( lastName );
        } else {
            Assert.assertFalse( lastName );
        }
    }
}