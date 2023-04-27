//29. Write a Java program to convert all the characters in a string to lowercase.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number or string:");
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase());
    }
}
