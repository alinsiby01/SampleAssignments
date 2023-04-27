//15. Write a program in Java to display the n terms of odd natural number and their sum.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int n = scanner.nextInt();
        oddNaturalNumbers(n);
    }
    public static void oddNaturalNumbers(int n){
        int sum =0;
        for (int i=1;i<=n+n;i=i+2){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.print("The Sum of odd Natural Number upto "+n+" terms is: ");
        System.out.print(sum);
    }
}
