package com.java.assignments.javaAssignment7.question4;

class BiCycleFactory implements CycleFactory{

    @Override
    public Cycle makeComplete() {
        System.out.println("complete bicycle fitting in Bicycle factory");
        return new Bicycle();
    }
}