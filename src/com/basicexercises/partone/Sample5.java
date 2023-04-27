//92. Write a Java program to count the number of even and odd elements in a given array of integers.

package com.basicexercises.partone;

import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        count();
    }
    public static void count(){
        Scanner scanner = new Scanner(System.in);
        int evenCount =0;
        int oddCount =0;
        System.out.println("Enter limit of integer array: ");
        int length = scanner.nextInt();
        System.out.println("Enter "+length+" integers ");
        int[] integerArray = new int[length];
        for (int i=0; i<length;i++){
            integerArray[i] = scanner.nextInt();
        }
        System.out.print("The given array is ");
        for (int number : integerArray) {
            System.out.print(number +",");
        }
        for (int number : integerArray) {
            if(number %2==0){
                evenCount += 1;
            }
            else {
                oddCount += 1;
            }
        }
        System.out.println("\nEven Count="+evenCount);
        System.out.println("Odd Count="+oddCount);
    }
}
