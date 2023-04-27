//48. Write a Java program to arrange the elements of a given array of integers where all negative integers appear
// before all the positive integers.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        System.out.println("Enter the " + l + " elements");
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
