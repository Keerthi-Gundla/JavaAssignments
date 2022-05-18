package com.java.assignments.javaAssignment7.question2;

import java.util.Scanner;

public class CycleDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Cycle[] cycle=new Cycle[3];
        Cycle cycle1=new Cycle();
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();

        for(int i=0;i<3;i++){
            cycle[i].balance();
        }

        Unicycle unicycle=(Unicycle) cycle[0];
        unicycle.balance();

        Bicycle bicycle=(Bicycle) cycle[1];
        bicycle.balance();

        Tricycle tricycle=(Tricycle) cycle[2];
        tricycle.balance();


    }
}
