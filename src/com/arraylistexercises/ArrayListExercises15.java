//15. Write a Java program to join two array lists.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises15 {
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
        System.out.println(teacherNames);
        ArrayList<String> names = new ArrayList<>();
        names.addAll(studentNames);
        names.addAll(teacherNames);
        System.out.println(names);
    }
}
