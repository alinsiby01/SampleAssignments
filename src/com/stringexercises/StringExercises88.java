//88. Write a Java program to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        String newText = text.replace("is","is not");
        System.out.println(newText);
    }
}
