//31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing
// order, "decreasing" if the numbers are in decreasing order, and "Neither increasing nor decreasing order" otherwise.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        if(a<b && b<c){
            System.out.println("Increasing order");
        } else if (a>b && b>c) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
