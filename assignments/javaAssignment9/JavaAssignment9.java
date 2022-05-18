package com.java.assignments.javaAssignment9;

import java.util.Scanner;

public class JavaAssignment9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String sentence=sc.nextLine();
        PatternMatcher match=new PatternMatcher();
        System.out.println("matched : "+match.isMatched(sentence));

    }
}
