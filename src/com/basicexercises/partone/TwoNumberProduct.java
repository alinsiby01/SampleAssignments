//5. Write a Java program that takes two numbers as input and display the product of two numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class TwoNumberProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println(n1 +"*" + n2 +" = "+(n1*n2));
    }
}
