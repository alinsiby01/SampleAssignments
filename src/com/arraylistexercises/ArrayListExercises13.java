//13. Write a Java program to compare two array lists.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        System.out.println("Enter student names: ");
        String studentName = scanner.nextLine().trim();
        while (!studentName.isEmpty()){
            studentNames.add(studentName);
            studentName = scanner.nextLine();
        }
        System.out.println(studentNames);

        ArrayList<String> teacherNames = new ArrayList<>();
        System.out.println("Enter teacher names: ");
        String teacherName = scanner.nextLine().trim();
        while (!teacherName.isEmpty()){
            teacherNames.add(teacherName);
            teacherName = scanner.nextLine();
        }

        ArrayList<String>compareResult = new ArrayList<>();
        for (String name:studentNames){
            compareResult.add(teacherNames.contains(name)?"yes":"no");
        }
        System.out.println(compareResult);
    }
}
