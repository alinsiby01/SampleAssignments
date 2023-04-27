//31. Write a Java program to trim any leading or trailing whitespace from a given string.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        String newText = text.replace(" ","");
        System.out.println(newText);
    }
}
