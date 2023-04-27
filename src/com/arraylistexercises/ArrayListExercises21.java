//21. Write a Java program to replace the second element of a ArrayList with the specified element.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("Enter the names: ");
        String names = scanner.nextLine().trim();
        while (!names.isEmpty()) {
            namesList.add(names);
            names = scanner.nextLine();
        }
        System.out.println(namesList);
        /*namesList.remove(1);
        namesList.add(1, "alin");*/
        namesList.set(1,"alin");
        System.out.println("After changing the 2nd element from array: ");
        System.out.println(namesList);
        namesList.forEach(name->System.out.println(name));
    }
}
