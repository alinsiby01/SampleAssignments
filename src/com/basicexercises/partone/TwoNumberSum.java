//2. Write a Java program to print the sum of two numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println(n1 +"+" + n2 +" = "+(n1+n2));
    }
}
