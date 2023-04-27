//52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

package com.basicexercises.partone;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        int sum = a+b;
        if(sum==c){
            System.out.println("The result is: true");
        }
    }
}
