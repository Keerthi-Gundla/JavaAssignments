package com.java.coreJavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFileDemo {
    public static void main(String args[]){
        Scanner input=null;
        try{
            input=new Scanner(new File("/home/keerG/IdeaProjects/JAVA/src/com/java/circlesInputdata.txt"));
        }catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
        ArrayList<Circle> circles=new ArrayList<>();
        int count=0;
        while(input.hasNext()){
            int radius=input.nextInt();
            circles.add(new Circle(radius));
        }
        PrintWriter pw=null;
        try{
            pw =new PrintWriter(new File("/home/keerG/IdeaProjects/JAVA/src/com/java/circlesOutput"));
            for(Circle c:circles){
                int area=c.getArea();
                double circum=c.getCircumference();
                System.out.println("area ="+area+"perimeter = "+circum);
                pw.println("Area = "+area+" circumference = "+circum);

            }
            pw.close();
        }catch(FileNotFoundException ex){
            System.out.println("cannot open file to print");
        }


        input.close();

    }
}
