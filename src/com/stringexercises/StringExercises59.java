//59. Write a Java program to read a string,if the string begins with "red" or "black" return that color string,
// otherwise return the empty string.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        if (text.startsWith("red")) {
            System.out.println("red");
        } else if (text.startsWith("black")) {
            System.out.println("black");
        } else {
            System.out.println(" ");
        }
    }
}
