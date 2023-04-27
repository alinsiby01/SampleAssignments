//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal nor different" otherwise.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        if(a == b && b == c){
            System.out.println("All numbers are equal");
        } else if (a==b || b==c|| a==c) {
            System.out.println("Neither all are equal nor different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
