//44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

package com.basicexercises.partone;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int n = scanner.nextInt();
        System.out.println(n+"+"+n+n+"+"+n+n+n);
    }
}
