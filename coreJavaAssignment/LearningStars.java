package com.java;

import java.util.Scanner;

public class LearningStars {
    public static int totalCost(int packageCost,int extraCourses,int coursecharge){
        return packageCost+(extraCourses*coursecharge);

    }
    public static void main(String args[]){
        int pack1=10;
        int pack2=12;
        int pack3=15;
        int pack1Extra=6;
        int pack2Extra=4;
        int pack3Extra=3;

        Scanner sc=new Scanner(System.in);
        System.out.println("Available packages :  package 1 : \n 10$/month 2 courses included and $6 each for extra course ");
        System.out.println("Available packages :  package 2 : \n 12$/month 4 courses included and $4 each for extra course ");
        System.out.println("Available packages :  package 3 : \n 15$/month 6 courses included and $3 each for extra course ");

        System.out.println("select the package and enter the package number");
        int pack=sc.nextInt();
        System.out.println("Enter the number of courses to be included");
        int course=sc.nextInt();
        switch(pack){
            case 1: System.out.println("Total cost : "+totalCost(pack1,(course-2),pack1Extra)+"$");
                    break;
            case 2: System.out.println("Total cost : "+totalCost(pack2,(course-4),pack2Extra)+"$");
                    break;
            case 3: System.out.println("Total cost : "+totalCost(pack3,(course-6),pack3Extra)+"$");
                    break;
            default:System.out.println("Package not available");

        }

    }
}
