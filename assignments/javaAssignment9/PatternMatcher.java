package com.java.assignments.javaAssignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternMatcher{
    public boolean isMatched(String sentence){
        Pattern p=Pattern.compile("^[A-Z].*[.]");
        Matcher m=p.matcher(sentence);
        return m.matches();

    }
}