package com.java.assignments.JavaAssignment10;

class SList<T>
{
    private Node<T> head = new Node<T>(null);
    SListIterator<T> iterator()
    {
        return new SListIterator<T>(head);
    }
    public String toString()
    {
        if(head.nextPointer == null)
            return "SList: No Elements added till now !";
        StringBuilder stringbuilder = new StringBuilder("SList: [");
        SListIterator<T> iterator = this.iterator();
        while(iterator.hasNext())
        {
            stringbuilder.append(iterator.next());
            if(iterator.hasNext())
                stringbuilder.append(',');

        }
        return stringbuilder + "]";
    }
}