package com.java;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private ArrayList<String> toppings=new ArrayList<>();
    private int numScoops;
    public IceCream(String name, int cost, int numScoops){
        this.name=name;
        this.cost=cost;
        this.numScoops=numScoops;
    }

    public void addToppings(String topping){
        toppings.add(topping);
    }

    public void printToppings(){
        for(String topping:toppings)
            System.out.println(topping);
    }
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }
}
