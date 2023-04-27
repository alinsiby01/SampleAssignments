//82. Write a Java program to create a new string repeating every character twice of a given string.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        int l = text.length();
        for (int i=0;i<l;i++){
            System.out.print(text.charAt(i)+""+text.charAt(i));
        }
    }
}