package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFileDemo {
    public static void main(String args[]){
        Scanner inputFile=null;
        try {
           inputFile = new Scanner(new File("/home/keerG/IdeaProjects/JAVA/src/rectangle_data.txt"));
        }catch(FileNotFoundException e){
            System.out.println("file cannot be opened");
        }
        ArrayList<Rectangle> rectangles=new ArrayList<>();
        int count=0;
        while(inputFile.hasNext()){
            int l=inputFile.nextInt();
            int b=inputFile.nextInt();
            rectangles.add(new Rectangle(l,b));
        }
        for(Rectangle rect:rectangles){
            System.out.println(" perimeter of the rectangle : "+rect.getPerimeter());
            System.out.println(" Area of the rectanle : "+rect.getArea());
        }
    }
}
