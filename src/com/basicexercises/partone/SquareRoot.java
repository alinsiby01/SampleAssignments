//117. Write a Java program to compute the square root of a given integer.

package com.basicexercises.partone;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer");
        int a = scanner.nextInt();
        System.out.println(Math.sqrt(a));
    }
}
