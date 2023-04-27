//52. Write a Java program to separate even and odd numbers of a given array of integers.
// Put all even numbers first, and then odd numbers.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises52 {
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
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
        }
    }
}
