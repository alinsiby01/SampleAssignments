//65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.

package com.basicexercises.partone;

import java.util.Scanner;

public class ModulesTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = scanner.nextInt();
        result(a,b);
    }

    public static void result(int a, int b){
        int divided = a/b;
        int result = a -(divided*b);
        System.out.println(result);
    }
}
