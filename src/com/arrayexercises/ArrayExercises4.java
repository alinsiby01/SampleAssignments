//4. Write a Java program to calculate the average value of array elements.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises4 {
    public static void main(String[] args) {
        getSumAndAverage();
    }
    public static void getSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" numbers ");
        int[] integerArray = new int[n];
        int sum = 0;
        for (int i=0; i<n;i++){
            System.out.println("Enter number "+(i+1)+": ");
            integerArray[i] = scanner.nextInt();
            sum = sum+integerArray[i];
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+(sum/n));
    }
}
