//2. Write a Java program to sum values of an array.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" numbers ");
        int[] integerArray = new int[n];
        int sum = 0;
        for (int i=0; i<n;i++){
            integerArray[i] = scanner.nextInt();
            sum = sum+integerArray[i];
        }
        System.out.println("Sum = "+sum);
    }
}
