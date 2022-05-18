package com.java.assignments.javaAssignment5;

public class Singleton {
    private String str1;
    /*public static Singleton initialize(String str1){
        this.str1=str1;
        return this;
    }
    This function doesn't work because static method cannot access non-static member variables.    */
    public void printString(){
        System.out.println("string value is : "+str1);
    }
}
