//17. Write a Java program to find the second-largest element in an array.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises17 {
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
        System.out.println("The second-largest value in the array is "+integerArray[l-2]);
    }
}
