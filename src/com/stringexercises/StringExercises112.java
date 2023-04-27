//112. Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        System.out.println("Enter the string to check: ");
        String test = scanner.nextLine();
        System.out.println(text.contains(test));
    }
}
