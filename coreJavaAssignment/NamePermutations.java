package com.java;

import java.util.Scanner;

public class NamePermutations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 full names of the persons : ");
        String names[]=new String[5];
        for(int name=0;name<5;name++){
            names[name]=sc.nextLine();
        }
        String[] firstName=new String[5];
        String[] lastName=new String[5];

        for(int i=0;i<5;i++){
            firstName[i]=names[i].substring(0,names[i].indexOf(" "));
            lastName[i]=names[i].substring(names[i].indexOf(" ")+1);
            System.out.println("first name: "+firstName[i].toUpperCase()+" last name : "+lastName[i].toUpperCase());
        }
        System.out.println("permutations : ");
        for(int first=0;first<5;first++){
            for(int last=0;last<5;last++){
                System.out.println(firstName[first]+" : "+lastName[last]);
            }
        }
    }
}
