package com.java.assignments.JavaAssignment10;

class SListIterator<T>
{
    Node<T> currentLink;
    SListIterator(Node<T> link)
    {
        currentLink = link;
    }
    public boolean hasNext() {
        return currentLink.nextPointer != null;
    }
    public Node<T> next()
    {
        currentLink = currentLink.nextPointer;
        return currentLink;
    }
    public void insert(T data)
    {
        currentLink.nextPointer = new Node<T>(data, currentLink.nextPointer);
        currentLink = currentLink.nextPointer;
    }
    public void remove(T data)
    {
        Node temp;
        while(currentLink.nextPointer!=null)
        {
            temp=currentLink;
            currentLink=currentLink.nextPointer;
            if(currentLink.data==data)
            {
                temp.nextPointer=currentLink.nextPointer;
                break;
            }
        }
    }
}