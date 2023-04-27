//12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i=1;i<=5;i++){
            System.out.println("Enter number"+i+" : ");
            int n = scanner.nextInt();
            sum +=n;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+(sum/5.0));
    }
}
