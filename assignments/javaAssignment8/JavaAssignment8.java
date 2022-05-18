package com.java.assignments.javaAssignment8;

import java.util.Scanner;

import static java.lang.System.exit;

public class JavaAssignment8 {
    private int amount;
    public void account() throws InvalidOption, InsufficientBalance, InvalidAge {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account holder name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age<18)
            throw new InvalidAge("age cannot be less than 18 years");
        while(true) {
            System.out.println("Enter 1 to deposit 2 to withdraw 3 to exit");
            int choice=sc.nextInt();
            int amt=0;
            switch(choice){
                    case 1: System.out.println("enter amount");
                            amt=sc.nextInt();
                            amount=amount+amt;
                            break;
                    case 2: System.out.println("enter amount");
                            amt=sc.nextInt();
                            amount=-amt;
                            if(amt>amount)
                                    throw new InsufficientBalance("your balance is less than "+amt);
                            break;
                    case 3: exit(0);
                    default: throw new InvalidOption("you have selected invalid option");
            }
        }
    }
    public static void main(String[] args){
        JavaAssignment8 account=new JavaAssignment8();
        try {
            account.account();
        }catch(Exception ex){
            System.out.println("Exception occured : "+ex.getMessage());
        }


    }
}
