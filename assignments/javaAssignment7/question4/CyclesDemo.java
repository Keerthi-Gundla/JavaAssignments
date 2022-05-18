package com.java.assignments.javaAssignment7.question4;

import java.util.Scanner;

public class CyclesDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Cycle cycle;
        CycleFactory cyclefactory;
        cyclefactory=new UniCycleFactory();
        cyclefactory.makeComplete().addWheels();
        cyclefactory=new BiCycleFactory();
        cyclefactory.makeComplete().addWheels();
        cyclefactory=new TriCycleFactory();
        cyclefactory.makeComplete().addWheels();
    }

}
