//53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number.

package com.basicexercises.partone;

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        System.out.println(compareInteger(a, b, c, true));
    }
    private static boolean compareInteger(int a, int b, int c, boolean abc) {
        if (abc)
            return (b < c);
        return (a<b&&b<c);
    }
}