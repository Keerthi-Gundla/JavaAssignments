package com.java.assignments.javaAssignment2;

import java.util.Scanner;

public class JavaAssignment2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text ");
        String text=sc.nextLine();
        AlphabetChecker check=new AlphabetChecker(text);
        if(check.checker()){
            System.out.println("Given text has all the alphabets");
        }else{
            System.out.println("Given text doesn't contains all the alphabets");
        }
    }
}

// 'n' is length of the string entered.
// Time complexity : O(n)[time complexity of indexOf() + time complexity of checker()=O(n)+O(1)]
// space complexity : O(1)
