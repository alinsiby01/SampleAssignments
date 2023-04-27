//100. Write a Java program to check if a given string contains another string. Return true or false.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        System.out.println("Enter the string to check: ");
        String test = scanner.nextLine();
        System.out.println(text.contains(test));
    }
}
