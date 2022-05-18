package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfElements {
    public static int addElements(ArrayList<Integer> list){
        int result=0;
        for(int i=0;i<list.size();i++){
            result=result+list.get(i);
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter the no of integers");
        int n=sc.nextInt();
        System.out.println("Enter the integer values");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("result= "+addElements(list));


    }
}
