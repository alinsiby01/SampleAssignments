//1. Write a Java program to get a number from the user and print whether it is positive or negative.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println(num+" is positive");
        }
        else {
            System.out.println(num+" is negative");
        }
    }
}
