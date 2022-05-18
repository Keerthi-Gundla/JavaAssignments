package com.java.assignments.javaAssignment5;

public class Main {
    public static void main(String[] args){
        UninitializedClass uninitialized=new UninitializedClass();
        uninitialized.printValues();
        uninitialized.localPrint();

        Singleton singleton=new Singleton();
        singleton.printString();
    }
}
