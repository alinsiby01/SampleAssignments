//245. Write a Java program which accepts students name, id, and marks and display the highest score and the lowest score.

package com.basicexercises.parttwo;

import java.util.ArrayList;
import java.util.Scanner;

public class SortMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int n = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id of student " + (i + 1));
            String q = scanner.next();
            System.out.println("Enter name of student " + (i + 1));
            String o = scanner.next();
            System.out.println("Enter the mark " + (i + 1));
            int p = scanner.nextInt();
            Student student = new Student(q,o, p);
            students.add(student);
        }
        students.sort(Student.sortMarkComparator);
        Student highest = students.get(n-1);
        Student lowest = students.get(0);
        System.out.println("Highest : "+highest.getName()+" "+highest.getMark()+" "+highest.getId());
        System.out.println("Lowest : "+lowest.getName()+" "+lowest.getMark()+" "+lowest.getId());
        students.forEach(student->System.out.println(student.getName()+" "+student.getMark()));
    }
}
