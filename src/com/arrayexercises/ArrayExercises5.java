//5. Write a Java program to test if an array contains a specific value.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises5 {
    public static void main(String[] args) {
      isPresent();
    }
    public static void isPresent(){
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = scanner.nextInt();
        System.out.println("Enter "+n+" numbers ");
        int[] integerArray = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the number "+(i+1));
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the specific value to check :");
        int num = scanner.nextInt();
        for (int arr:integerArray) {
            if(arr == num){
                s=1;break;
            }
        }
        if(s==1){
            System.out.println("\nThe number "+num+" is present.");
        }
        else{
            System.out.println("\nThe number "+num+" is not present.");
        }
    }
}
