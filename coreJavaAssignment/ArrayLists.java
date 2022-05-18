package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the non negative integers");
        int num;
        while(true){
            num=sc.nextInt();
            if(num<0)
                break;
            list.add(num);
        }

        System.out.println("the entered numbers in reverse order : ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
        sc.nextLine();
        ArrayList<String> names=new ArrayList<String>();
        System.out.println("enter the 5 names of the persons");

        for(int i=0;i<5;i++){
            names.add(sc.nextLine());
        }

        ArrayList<Integer> ages=new ArrayList<>();
        for(int i=0;i<5;i++){
            ages.add(sc.nextInt());
        }

        System.out.println("persons along with the ages");
        for(int i=0;i<5;i++){
            System.out.println(names.get(i)+" age is "+ages.get(i));
        }
    }
}
