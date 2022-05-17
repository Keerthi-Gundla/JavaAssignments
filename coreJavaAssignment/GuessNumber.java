package com.java;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class GuessNumber {
    public static int getNumber(){
        Random random=new Random();
        return random.nextInt(99)+1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int answer=getNumber();
        int guess=-1;

        while(guess!=answer) {
            System.out.println("Enter the guess");
            guess=sc.nextInt();
            if(guess>answer){
                System.out.println("Guess is too high");
            } else if (guess<answer) {
                System.out.println("Guess is too small");
            }else if(guess==answer)
                System.out.println("Congratulations your guess is correct.");
            else if (guess>100) {
                System.out.println("out of range !!! ");
                exit(0);
            }
        }

    }
}
