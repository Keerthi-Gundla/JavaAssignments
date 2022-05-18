package com.java.assignments.javaAssignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAssignment11 {
    public static void update(Map<Character,Integer> map,char key){
        int val=map.get(key);
        val=val+1;
        map.put(key,val);
    }
    public static Map<Character,Integer> countAlphabets(Scanner file){
        Map<Character,Integer> map=new HashMap<>();
        while(file.hasNext()){
            String str=file.next();
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i)))
                   update(map,str.charAt(i));
                else
                    map.put(str.charAt(i),1);
            }
        }
        file.close();
        return map;
    }

    public static void printOutput(Map<Character,Integer> map) throws FileNotFoundException {
        File file=new File("/home/keerG/IdeaProjects/JAVA/src/com/java/assignments/outputFile.txt");
        PrintWriter print=new PrintWriter(file);

        for(Map.Entry<Character,Integer> item: map.entrySet()){
            //printing to the output file
            print.println("key :value = "+item.getKey()+" : "+item.getValue());
            System.out.println(item.getKey()+" : "+item.getValue());
        }

        print.close();
    }
    public static void main(String args[]){
        String filename=args[0];
        File file=null;
        Scanner input=null;
        try{
            file=new File("/home/keerG/IdeaProjects/JAVA/src/com/java/assignments/"+filename);
            input=new Scanner(file);

            //gets the map that has alphabet count
            Map<Character,Integer> map=countAlphabets(input);

            //print the map output into the output file
            printOutput(map);
        }catch(Exception ex){
            System.out.println("file not found");
        }
    }
}
