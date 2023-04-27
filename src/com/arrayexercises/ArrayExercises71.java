//71. Write a Java program to form the largest number from a given list of non-negative integers.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();
        int[] integerArray = new int[limit];
        System.out.println("Enter the " + limit + " elements.");
        for (int i = 0; i < limit; i++) {
            integerArray[i] = scanner.nextInt();
        }
        System.out.print("The given array is ");
        for (int arr : integerArray) {
            System.out.print(arr + ",");
        }
        Arrays.sort(integerArray);
        System.out.print("\nLargest number using the given array is: ");
        for (int i = limit - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
        }
    }
}
