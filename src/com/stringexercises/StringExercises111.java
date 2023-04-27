//111. Write a Java program that removes a specified word from a given text. Return the new string.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        System.out.println("Enter the word to remove: ");
        String word = scanner.nextLine();
        String newText = text.replace(word,"");
        System.out.println(newText);
    }
}
