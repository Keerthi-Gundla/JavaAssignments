package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderExample {
    public static void main(String  args[]) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String date=sc.next();
        Date date1=new SimpleDateFormat("DD-MM-YYYY").parse(date);
        Calendar calender=Calendar.getInstance();
        calender.setTime(date1);
        System.out.println("month:"+calender.get(Calendar.MONTH));
    }
}
