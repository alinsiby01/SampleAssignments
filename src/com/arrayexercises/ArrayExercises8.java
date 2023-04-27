//8. Write a Java program to copy an array by iterating the array.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        int[] integerArray = new int[l];
        System.out.println("Enter the "+l+"numbers: ");
        for (int i=0;i<l;i++){
            integerArray[i] = scanner.nextInt();
        }
        int[] newArray = Arrays.copyOf(integerArray,l);
        System.out.print("Given Array: ");
        for (int arr1:integerArray) {
            System.out.print(arr1+",");
        }
        System.out.print("\nNew Array: ");
        for (int arr2:newArray) {
            System.out.print(arr2+",");
        }
    }
}
