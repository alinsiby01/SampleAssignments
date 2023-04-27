//17. Write a Java program to add two binary numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        long n1 = scanner.nextLong();
        System.out.println("Enter the 2nd number: ");
        long n2 = scanner.nextLong();
        System.out.println(n1 +"+" + n2 +" = "+(n1+n2));
    }
}
