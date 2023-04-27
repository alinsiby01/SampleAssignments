//11. Write a program in Java to display n terms of natural numbers and their sum.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int limit = scanner.nextInt();
        int sum =0;
        for (int i=1;i<=limit;i++){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
