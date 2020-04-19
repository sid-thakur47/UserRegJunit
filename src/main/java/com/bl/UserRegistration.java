package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern NAME_PATTERN = Pattern.compile( "^[A-Z][a-z]{3,}$" );

    public boolean validateName(String name) {
        Matcher matcher = NAME_PATTERN.matcher( name );
        return matcher.matches();
    }
}