package com.java.assignments.javaAssignment7.question5;

class SecondClass extends FirstClass{
    SecondClass(){
        System.out.println("second inner class constructor");
    }
    public class SecondInnerClass extends FirstClass.FirstInnerClass{
        SecondInnerClass(int val){
            super(val);
            System.out.println("second inner class value :"+val);
        }
        public void secondMethod(){
            System.out.println("This is second method from second inner class");
        }
    }
}