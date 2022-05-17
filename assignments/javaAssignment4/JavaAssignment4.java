package com.java.assignments.javaAssignment4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaAssignment4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n=input.nextInt();
        System.out.println("Enter the signup and current dates");
        String signupDate;
        String currDate;
        for(int i=0;i<n;i++){
            signupDate=input.next();
            currDate=input.next();
            try {
                new KYC(signupDate, currDate).getRangesOfDates();
            }catch(ParseException ex){
                System.out.println("cannot parse the given data please check the format of the given format");
            }
        }
    }
}
