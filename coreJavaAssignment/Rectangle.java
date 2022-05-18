package com.java;

public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }

    public int getPerimeter(){
        return 2*(length+breadth);
    }

    public int getArea(){
        return length*breadth;
    }
}
