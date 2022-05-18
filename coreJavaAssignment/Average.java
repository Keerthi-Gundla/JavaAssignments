package com.java;

import java.util.Scanner;

public class Average {
    int num1;
    int num2;
    int num3;
    Average(int n1,int n2,int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public double average(){
        double avg=(num1+num2+num3)/3.0;
        return avg;
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the three integers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();

            Average avg=new Average(num1,num2,num3);
            System.out.println("The average of the three numbers : "+avg.average());
        }
    }
}
