//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("Enter the names: ");
        String names = scanner.nextLine().trim();
        while (!names.isEmpty()) {
            namesList.add(names);
            names = scanner.nextLine();
        }
        int limit = namesList.size();
        for (int i=0;i<limit;i++){
            System.out.println("Index: "+i+" Name: "+ namesList.get(i));
        }
    }
}
