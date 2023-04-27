//51. Write a Java program to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order.
package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        System.out.println("Enter the " + l + " elements.");
        int[] integerArray = new int[l];
        for (int i = 0; i < l; i++) {
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("The given array is ");
        for (int arr : integerArray) {
            System.out.print(arr + " ");
        }
        System.out.println("\nThe rearranged array is ");
        Arrays.sort(integerArray);
        for (int arr : integerArray) {
            System.out.print(arr + " ");
        }
    }
}
