//65. Write a Java program to find maximum difference between two elements in a given array of integers such that smaller
// element appears before larger element.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        int[] integerArray = new int[l];
        System.out.println("Enter the " + l + " elements:");
        for (int i = 0; i < l; i++) {
            integerArray[i] = scanner.nextInt();
        }
        Arrays.sort(integerArray);
        System.out.println("The maximum differences between two elements is " + (integerArray[l - 1] - integerArray[0]) + " of pair (" + integerArray[l - 1] + "," + integerArray[0] + ")");
    }
}
