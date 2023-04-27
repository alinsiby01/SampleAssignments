//1. Write a Java program to sort a numeric array and a string array.

package com.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter limit: ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" numbers ");
        int[] arrI = new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Enter number "+(i+1)+": ");
            arrI[i] = scanner.nextInt();
        }
        Arrays.sort(arrI);
        for (int t: arrI) {
            System.out.print(t+",");
        }

        System.out.println("Enter limit: ");
        int l = scanner.nextInt();
        System.out.println("Enter "+l+" names ");
        String[] arr = new String[l];
        for (int i=0; i<l;i++){
            System.out.println("Enter the name "+(i+1)+": ");
            arr[i] = scanner.next();
        }
        Arrays.sort(arr);
        for (String t: arr) {
            System.out.print(t+",");
        }
    }
}
