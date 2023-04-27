//106. Write a Java program to concatenate a given string with itself of a given number of times.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        System.out.println("Enter the number of times to repeat: ");
        int n = scanner.nextInt();
        StringBuilder newText = new StringBuilder();
        for (int i=0;i<n;i++){
            newText.append(text);
        }
        System.out.println(newText);
    }
}
