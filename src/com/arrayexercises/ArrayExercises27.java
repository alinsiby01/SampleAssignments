//27. Write a Java program to find the number of even and odd integers in a given array of integers.

package com.arrayexercises;

import java.util.Scanner;

public class ArrayExercises27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of the array: ");
        int l = scanner.nextInt();
        int[] integerString = new int[l];
        int e = 0;
        int o = 0;
        System.out.println("Enter the "+l+" elements");
        for (int i=0;i<l;i++){
            integerString[i] =scanner.nextInt();
            if(integerString[i]%2==0){
                e = e + 1;
            }
            else {
                o = o + 1;
            }
        }
        System.out.println("Number of even integers in the given array = "+e);
        System.out.println("Number of odd integers in the given array = "+o);
    }
}
