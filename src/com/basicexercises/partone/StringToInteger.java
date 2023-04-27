//51. Write a Java program to convert a string to an integer in Java.

package com.basicexercises.partone;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String Number: ");
        String a = scanner.nextLine();
        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
