package com.java.assignments.java_assignment;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentOperations {
    public void printDepartments(List<Student> list){
        list.stream()
                .map((s)->s.getEngDepartment())
                .distinct()
                .forEach(System.out::println);
    }

    public void studentsEnrolledAfter2018(List<Student> list){
        list.stream()
                .filter((s)->s.getYearOfEnrollment()>2018?true:false)
                .map((s)->s.getName())
                .forEach(System.out::println);
    }

    public void printMaleStudentsDetails(List<Student> list){
        list.stream()
                .filter((s)->s.getGender()=="Male"?true:false)
                .forEach(System.out::println);
    }

    public void printNoOFStudents(List<Student> list){
        Map<String,List<Student>> students= list.stream()
                .collect(Collectors.groupingBy((s)->s.getGender()));
        System.out.println("male students : "+students.get("Male").size()+" female students : "+students.get("Female").size());
    }

    public void avgAgeOfStudents(List<Student> list){
        Map<String,List<Student>> average=list.stream()
                .collect(Collectors.groupingBy((s)->s.getGender()));
        double femaleAvg=average.get("Female").stream()
                        .collect(Collectors.summarizingInt((s)->s.getAge())).getAverage();
        double maleAvg=average.get("Male").stream()
                .collect(Collectors.summarizingInt((s)->s.getAge())).getAverage();

        System.out.println("average age of the male "+femaleAvg+"and female students "+maleAvg);
    }

    public void printHighestPercentageStudentDetails(List<Student> list){
        double highest=list
                .stream()
                .collect(Collectors.summarizingDouble((s)->s.getPerTillDate())).getMax();
        list.stream().filter((s)->s.getPerTillDate()==highest).forEach(System.out::println);
    }

    public void noOfStudentsInDepartment(List<Student> list){
        Map<String,List<Student>> stream=list
                .stream()
                .collect(Collectors.groupingBy((s)->s.getEngDepartment()));
        for (Map.Entry<String,List<Student>> item:stream.entrySet()) {
            System.out.println(item.getKey()+" department : "+item.getValue().size());
        }
    }

    public void printAveragePercentageDepWise(List<Student> list){
        Map<String,List<Student>> stream=list
                .stream()
                .collect(Collectors.groupingBy((s)->s.getEngDepartment()));
        for (Map.Entry<String,List<Student>> item:stream.entrySet()) {
            System.out.println("Average of "+item.getKey()+":"+item.getValue()
                    .stream()
                    .collect(Collectors.summarizingDouble((s)->s.getPerTillDate())).getAverage());
        }
    }

    public void printYoungestStudent(String department,List<Student> list){
        int minAge=list.stream()
                .filter((s)->s.getEngDepartment()==department)
                .collect(Collectors.summarizingInt((s)->s.getAge())).getMin();
        list.stream()
                .filter((s)->s.getAge()==minAge && s.getEngDepartment()==department)
                .forEach(System.out::println);
    }

    public void studentsInComputerScience(List<Student> list){
        Map<String,List<Student>> stud=list.stream().filter((s)->s.getEngDepartment()=="Computer Science").collect(Collectors.groupingBy((s)->s.getGender()));
        for(Map.Entry<String,List<Student>> item: stud.entrySet()){
            System.out.println("no of "+item.getKey()+" students :"+item.getValue().size());
        }
    }

}
