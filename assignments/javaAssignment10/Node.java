package com.java.assignments.JavaAssignment10;

class Node<T> {
    T data;
    Node<T> nextPointer;
    Node(T e)
    {
        this(e, null);
    }
    Node(T data, Node<T> nextPointer)
    {
        this.data = data;
        this.nextPointer = nextPointer;
    }
    public String toString()
    {
        if(data == null)
            return "Null";
        return data.toString();
    }
}