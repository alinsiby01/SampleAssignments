//59. Write a Java program to find maximum product of two integers in a given array of integers.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises59 {
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
        System.out.println("The maximum product of two integers in a given array is " + (integerArray[l - 1] * integerArray[l - 2]) + " of pair (" + integerArray[l - 1] + "," + integerArray[l - 2] + ")");
    }
}
