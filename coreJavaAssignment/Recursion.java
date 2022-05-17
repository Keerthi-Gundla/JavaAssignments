package com.java;

import java.util.Scanner;

public class Recursion {
    public int countUpTo(int count,int upTo){
        if(count==upTo){
            return 1;
        }else{
            System.out.println("count="+(count+1));
            countUpTo(count+1,upTo);

        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count value : ");
        int upTo=sc.nextInt();
        new Recursion().countUpTo(0,upTo);
    }
}
