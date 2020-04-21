package com.bl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class EmailTest {

    public String email;
    boolean testEmail;

    public EmailTest(String email, boolean testEmail) {
        this.email = email;
        this.testEmail = testEmail;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> emailList() {
        return Arrays.asList( new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc-gmail.com", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        } );
    }

    @Test
    public void WhenRightEmail_IsProvide_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean emailValue = userRegistration.validateEmail( email );
        if (testEmail) {
            Assert.assertTrue( emailValue );
        } else {
            Assert.assertFalse( emailValue );
        }
    }
}