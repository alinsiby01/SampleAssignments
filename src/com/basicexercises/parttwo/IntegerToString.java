//166. Write a Java program to transform a given integer to String format.

package com.basicexercises.parttwo;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        int a = scanner.nextInt();
        String b = Integer.toString(a);
        System.out.println(b);
    }
}
