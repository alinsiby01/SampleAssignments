//9. Write a Java program to insert an element (specific position) into an array.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        int[] integerArray = new int[l];
        System.out.println("Enter the "+l+" elements:");
        for (int i=0;i<l;i++){
            integerArray[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ");
        for (int arr:integerArray) {
            System.out.print(arr+",");
        }
        System.out.println("\nEnter the index to replace with a number: ");
        int i = scanner.nextInt();
        System.out.println("Enter value to change: ");
        int n = scanner.nextInt();
        integerArray[i] = n;
        System.out.print("New Array: ");
        for (int arr1:integerArray) {
            System.out.print(arr1+",");
        }
    }
}
