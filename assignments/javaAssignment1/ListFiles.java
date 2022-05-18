package com.java.assignments.javaAssignment1;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListFiles {
    public static void findFiles(File file){
        if(file.isDirectory()){
            try {
                // gives files and directory in given directory. if directory is empty throws NullPointerException
                File[] files = file.listFiles();
                for(File f:files){
                    findFiles(f); // recursive call
                }
            }catch(NullPointerException ex){}
        }else{
            if(isMatched(file))
                System.out.println("file name :"+file.getName()+" path : "+file.getAbsolutePath());
       }
    }

    //returns true if pattern matched
    public static boolean isMatched(File file){
        Pattern p=Pattern.compile(".txt$");
        Matcher m=p.matcher(file.getName());
        return m.find();
    }

    public static void main(String[] args){
        File file=new File("/home/keerG");
        findFiles(file);
    }
}
