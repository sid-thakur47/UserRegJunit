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

    UserRegistration userRegistration = new UserRegistration();

    public NameTest(String name) {
        this.name = name;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList( new Object[][]{
                {"Siddhesh"},
                {"Ramesh"},
                {"siddhesh"},
                {"ramesh"},
                {"Thakur"},
                {"Koli"},
                {"thaku@r"},
                {"koli@"},
        } );
    }
    @Test
    public void WhenName_IsProvide_ShouldReturnTrue() {
        boolean correctName = userRegistration.validateName( name );
        Assert.assertTrue( correctName );
    }
    @Test
    public void WhenWrongName_IsProvided_ShouldReturnFalse() {
        boolean wrongName = userRegistration.validateName( name );
        Assert.assertFalse( wrongName );
    }
}