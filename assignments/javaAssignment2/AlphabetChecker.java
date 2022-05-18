package com.java.assignments.javaAssignment2;


public class AlphabetChecker {
    private String text;
    public AlphabetChecker(String text){
        this.text=text;
    }

    public boolean checker(){
        int ascii=65;
        for(ascii=65;ascii<91;ascii++){
            int letter=ascii;
            if(text.indexOf((char)letter)<0 && text.indexOf((char)(letter+32))<0)
                return false;
        }
        return true;
    }
}