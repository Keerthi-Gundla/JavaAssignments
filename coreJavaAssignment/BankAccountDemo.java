package com.java;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account holder name:");
        String name=sc.nextLine();
        System.out.println("Enter the initial amount ");
        int initialAmount=sc.nextInt();
        BankAccount account;
        if(initialAmount>0){
            account=new BankAccount(name,initialAmount);
        }else{
            account=new BankAccount(name);
        }
        System.out.println("Enter 1 for deposit and 2 for withdraw and 3 for balance enquiry");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the amount to be deposited");
            int amount=sc.nextInt();
            try {
                account.deposit(amount);
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(choice==2){
            System.out.println("Enter the amount to be withdrawn");
            int amount=sc.nextInt();
            try {
                account.withdraw(amount);
            }catch(Exception e){
                System.out.println(e);
            }
        }else{
            System.out.println("Amount: "+account.getBalance());
        }

    }
}
