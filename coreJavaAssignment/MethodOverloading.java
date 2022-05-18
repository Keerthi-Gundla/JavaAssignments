package com.java;

public class MethodOverloading {
    public static void main(String args[]){
        int result=add(10,20);
        System.out.println("addition = "+result);

        result=add(10,"20");
        System.out.println("addition = "+result);

        String res=add("10","20");
        System.out.println("addition = "+result);
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int add(int num1,String num2){
        return num1+ Integer.parseInt(num2);
    }

    public static String add(String num1,String num2){
        int result=Integer.parseInt(num1)+ Integer.parseInt(num2);
        return String.valueOf(result);
    }


}
