//113. Write a Java program to merge two given sorted array of integers and create a new sorted array.

package com.basicexercises.partone;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit of 1st array: ");
        int l1 = scanner.nextInt();
        int[] arr1 = new int[l1];
        for (int i=0;i<l1;i++){
             arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the limit of 2nd array: ");
        int l2 = scanner.nextInt();
        int[] arr2 = new int[l2];
        for (int i=0;i<l2;i++){
            arr2[i] = scanner.nextInt();
        }
        int l3 = l1+l2;
        int j=0;
        int[] arr3 = new  int[l3];
        for (int i=0;i<l1;i++){
            arr3[j++] = arr1[i];
        }
        for (int i=0;i<l2;i++){
            arr3[j++] = arr2[i];
        }
        Arrays.sort(arr3);
        for (int a:arr3) {
            System.out.print(a+",");
        }
    }
}
