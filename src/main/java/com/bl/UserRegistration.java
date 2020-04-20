package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern NAME_PATTERN = Pattern.compile( "^[A-Z][a-z]{3,}$" );
    Pattern EMAIL_PATTERN = Pattern.compile( "^[a-z0-9]{1,}([.|-]?[a-z0-9]+)?[@][a-z0-9]{1,}.[a-z]{2,4}(.{1}[a-z]{2})?$" );

    public boolean validateName(String name) {
        Matcher matcher = NAME_PATTERN.matcher( name );
        return matcher.matches();
    }
    public boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher( email );
        return matcher.matches();
    }
}