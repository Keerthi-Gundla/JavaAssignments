package com.java.assignments.javaAssignment7.question3;

class ImplementInterfaces extends ConcreteClass implements Interface4{

    @Override
    public void introduce() {
        System.out.println("introducing the interface 1 method ");
    }

    @Override
    public void printSomething() {
        System.out.println("printing the interface 1 method");
    }

    @Override
    public void show() {
        System.out.println("showing the interface 2 ");
    }

    @Override
    public void print() {
        System.out.println("printing the interface 2");
    }

    @Override
    public void display() {
        System.out.println("displaying the interface 3");
    }

    @Override
    public void showDetails() {
        System.out.println("showing details of interface 3");
    }

    @Override
    public void showInterface4() {
        System.out.println("This is the method from interface 4");
    }

    public void method1(Interface1 obj){
        obj.introduce();
        obj.printSomething();
    }
    public void method2(Interface2 obj2){
        obj2.print();
        obj2.show();
    }
    public void method3(Interface3 obj){
        obj.display();
        obj.showDetails();
    }

    public void method4(Interface4 obj){
        obj.showInterface4();
    }
}
