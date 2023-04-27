//8. Write a Java program to sort a given array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names: ");
        ArrayList<String> names = new ArrayList<>();
        String name = scanner.nextLine().trim();
        while (!name.isEmpty()) {
            System.out.println("If you want to stop the code, please double tap on enter key nor keep adding value.");
            names.add(name);
            name = scanner.nextLine();
        }
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }
}
