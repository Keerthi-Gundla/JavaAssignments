package com.java.assignments.javaAssignment5;

public class UninitializedClass {
    private int num1;
    private char char1;
    public void printValues(){
        System.out.println("integer value : "+num1);
        System.out.println("character value : "+char1);
    }
    public void localPrint(){
        int localNum;
        char localChar;
        /*
        System.out.println("local integer value : "+localNum);
        System.out.println("local char value : "+localChar);

        this part of code doesnot work because local variables are not initialized but this works in instance variables
        because in java by default they will be initialized.
         */
    }
}
