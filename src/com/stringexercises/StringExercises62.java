//62. Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        if (text.length()<4) {
            System.out.println("false");
        } else if (text.startsWith("good")) {
            System.out.println("true");
        } else if(text.startsWith("good", 1)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
