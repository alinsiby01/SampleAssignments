//29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises29 {
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
        double sum =0;
        for (int i=1;i<l-1;i++){
            sum = sum + integerArray[i];
        }
        System.out.println("The average value of an array of integers except the largest and smallest values is "+(sum/(l-2)));
    }
}
