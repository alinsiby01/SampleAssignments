//6. Write a Java program to find the index of an array element.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        int[] integerArray = new int[l];
        System.out.println("Enter the "+l+" elements.");
        for (int i=0;i<l;i++){
            integerArray[i] =scanner.nextInt();
        }
        System.out.print("The given array is ");
        for (int arr:integerArray) {
            System.out.print(arr+",");
        }
        System.out.println("\nEnter the number to find index :");
        int n = scanner.nextInt();
        for (int i=0;i<l;i++){
            if(integerArray[i]==n){
                System.out.println("The number "+n+" is present in index "+i);break;
            }
        }
    }
}
