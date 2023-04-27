//11. Write a Java program to reverse elements in an array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercises11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names: ");
        ArrayList<String> names = new ArrayList<>();
        String name = scanner.nextLine().trim();
        while (!name.isEmpty()){
            names.add(name);
            name = scanner.nextLine();
        }
        System.out.println("The given String ");
        System.out.println(names);
        Collections.reverse(names);
        System.out.println("After reversing the string");
        System.out.println(names);
    }
}
