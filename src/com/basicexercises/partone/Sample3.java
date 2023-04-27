//54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.

package com.basicexercises.partone;

import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        System.out.println("The result is: "+rightmost(a,b,c));
    }

    private static boolean rightmost(int a, int b, int c) {
        return (a%10==b%10||b%10==c%10||a%10==c%10);
    }
}
