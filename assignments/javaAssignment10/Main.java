package com.java.assignments.JavaAssignment10;

public class Main
{
    public static void main(String[] args)
    {
        SList<Integer> sList = new SList<>();
        SListIterator<Integer> sListIterator = sList.iterator();
        System.out.println(sList);
        sListIterator.insert(9);
        sListIterator.insert(8);
        sListIterator.insert(7);
        sListIterator.insert(6);
        sListIterator.insert(5);
        System.out.println(sList);
        sListIterator=sList.iterator();
        sListIterator.remove(8);
        System.out.println(sList);
    }
}
