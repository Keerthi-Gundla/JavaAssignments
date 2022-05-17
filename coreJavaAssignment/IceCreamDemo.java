package com.java;

import java.util.Scanner;

public class IceCreamDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the icecream name :");
        String name=sc.nextLine();
        System.out.println("Enter the cost of icecream");
        int cost=sc.nextInt();
        System.out.println("Enter the num of scoops of icecream ");
        int scoops=sc.nextInt();
        sc.nextLine();
        IceCream icecream=new IceCream(name,cost,scoops);
        System.out.println("Enter the toppings 5 toppings");
        for(int i=0;i<5;i++){
            icecream.addToppings(sc.nextLine());
        }

        System.out.println("name: "+icecream.getName());
        System.out.println("cost: "+icecream.getCost());
        System.out.println("num of scoops: "+icecream.getNumScoops());
        icecream.printToppings();

    }
}
