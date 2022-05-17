package com.java;

public class BankAccount {
    private final String owner;
    private int balance;
    public BankAccount(String owner){
        balance=0;
        this.owner=owner;
    }
    public BankAccount(String owner,int bal){
        this.owner=owner;
        if(bal<=0)
            System.out.println("account must be greater than 0.");
        balance =bal;
    }
    public void deposit(int amt) throws Exception{
        if(amt<0)
            throw new Exception("amount cannot be negative");
        balance=balance+amt;
    }

    public void withdraw(int bal) throws Exception{
        if(bal>balance){
            throw new Exception("don't have sufficient balance");
        }
        if(bal<0)
            throw new Exception("amount cannot be negative");
        balance=balance-bal;
    }
    public int getBalance() {
        return balance;
    }


    public String getOwner() {
        return owner;
    }

}
