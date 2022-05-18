package com.java;

import java.util.Scanner;

public class MidLibsClone {
    String story;
    public void makeStory(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first adjective: ");
        String inputWord=sc.nextLine();
        story="There was a "+inputWord;
        System.out.println("Enter the girl's name : ");
        inputWord=sc.nextLine();
        story=story+" named "+ inputWord;
        System.out.println("Enter the another adjective : ");
        inputWord=sc.nextLine();
        story=story+" who was a "+inputWord;
        System.out.println("enter the occupation : ");
        inputWord=sc.nextLine();
        story=story+" "+inputWord;
        System.out.println("Enter the place : ");
        inputWord=sc.nextLine();
        story=story+" in the kingdom of "+inputWord;

        System.out.println(story);
    }
    public static void main(String args[]){
        new MidLibsClone().makeStory();
    }
}
