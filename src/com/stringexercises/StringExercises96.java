//96. Write a Java program to create a new string after removing a specified character from a given string
// except the first and last position.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        String newText = text.replace("z", "");
        System.out.println(newText);
    }
}
