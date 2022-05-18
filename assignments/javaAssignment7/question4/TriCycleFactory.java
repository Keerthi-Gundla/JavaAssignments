package com.java.assignments.javaAssignment7.question4;

class TriCycleFactory implements CycleFactory{

    @Override
    public Cycle makeComplete() {
        System.out.println("complete fitting in tricycle factory");
        return new TriCycle();
    }
}