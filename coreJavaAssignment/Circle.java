package com.java.coreJavaAssignment;

public class Circle {
    private int radius;
    public Circle(int r){
        radius=r;
    }

    public int getArea(){
        return radius*radius;
    }

    public double getCircumference(){
        return 2*22.7*radius;
    }
}
