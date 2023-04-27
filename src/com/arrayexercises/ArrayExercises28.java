//28. Write a Java program to get the difference between the largest and smallest values in an array of integers.
// The length of the array must be 1 and above.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        int[] integerArray = new int[l];
        System.out.println("Enter the "+l+" elements:");
        for (int i=0;i<l;i++){
            integerArray[i] = scanner.nextInt();
        }
        Arrays.sort(integerArray);
        System.out.println("Difference = "+(integerArray[l-1]-integerArray[0]));
    }
}
