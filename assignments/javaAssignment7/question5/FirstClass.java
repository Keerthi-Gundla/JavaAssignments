package com.java.assignments.javaAssignment7.question5;

public class FirstClass {
    FirstClass(){
        System.out.println("first class constructor");
    }
    public class FirstInnerClass{
        int value;
        FirstInnerClass(int val){
            value=val;
            System.out.println("first inner class constructor");
        }
        public void FirstMethod(){
            System.out.println("first inner class methods");
        }
    }
}


