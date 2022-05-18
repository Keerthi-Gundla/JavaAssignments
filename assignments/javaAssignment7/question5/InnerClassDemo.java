package com.java.assignments.javaAssignment7.question5;

public class InnerClassDemo{
    public static void main(String args[]){
        SecondClass second=new SecondClass();
        SecondClass.SecondInnerClass obj=second.new SecondInnerClass(5);
        obj.FirstMethod();
        obj.secondMethod();

    }
}

