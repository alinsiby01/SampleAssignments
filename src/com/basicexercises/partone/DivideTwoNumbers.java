//3. Write a Java program to divide two numbers and print on the screen.

package com.basicexercises.partone;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println(n1 +"/" + n2 +" = "+(n1/n2));
    }
}
