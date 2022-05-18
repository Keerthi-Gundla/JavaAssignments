package com.java.assignments.javaAssignment7.question1;

import java.util.Scanner;

public class RodentExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rodents");
        int n=sc.nextInt();
        Rodent rodents[]=new Rodent[5];
        for(int i=0;i<n;i++){
            System.out.println("Enter 1.Rat 2.Mice 3.Squirrel");
            int choice=sc.nextInt();
            switch(choice){
                case 1: rodents[i]=new Rat();
                        break;
                case 2: rodents[i]=new Mice();
                        break;
                case 3: rodents[i]=new Squirrels();
                        break;
                default:
                    System.out.println("cannot create");
            }

        }
        for(int i=0;i<n;i++){
            rodents[i].giveBirth();
            rodents[i].countTeeth(); //derived class methods will be invoked
        }
    }
}
