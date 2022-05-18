package com.java.assignments.javaAssignment7.question4;

class UniCycleFactory implements CycleFactory{

    @Override
    public Cycle makeComplete() {
        System.out.println("complete the unicycle fitting");
        return new UniCycle();
    }
}