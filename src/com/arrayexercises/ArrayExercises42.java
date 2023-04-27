//42. Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        System.out.println("Enter the "+l+" elements.");
        int[] integerArray = new int[l];
        for (int i=0;i<l;i++){
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("The given array is ");
        for (int arr:integerArray) {
            System.out.print(arr+" ");
        }
        System.out.println("\nThe rearranged array is ");
        for (int i=0;i<l;i++){
            if(integerArray[i]==0){
                System.out.print(integerArray[i]+" ");
            }
        }
        for (int i=0;i<l;i++){
            if(integerArray[i]==1){
                System.out.print(integerArray[i]+" ");
            }
        }
    }
}
