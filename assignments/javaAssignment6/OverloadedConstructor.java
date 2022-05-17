package com.java.assignments.javaAssignment6;

public class OverloadedConstructor
{
    OverloadedConstructor()
    {
        this("keerthi");
        System.out.println("Inside constructor1");
    }
    OverloadedConstructor(String name)
    {
        System.out.println("The name is : "+name);
        System.out.println("Inside constructor2");
    }

    public static void main(String[] args) {
        OverloadedConstructor overloaded = new OverloadedConstructor();
    }

}

