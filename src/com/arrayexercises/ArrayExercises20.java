//20. Write a Java program to convert an array to ArrayList.

package com.arrayexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int l = scanner.nextInt();
        String[] stringArray = new String[l];
        System.out.println("Enter the "+l+" elements:");
        for (int i=0;i<l;i++){
            stringArray[i] = scanner.next();
        }
        System.out.println("The given array is ");
        for (String arr:stringArray) {
            System.out.print(arr+",");
        }
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println("\n"+stringArrayList);
    }
}
