//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n3 = scanner.nextInt();
        average(sum(n1,n2,n3));
    }
    public static int sum(int n1, int n2, int n3){
        return (n1+n2+n3);
    }
    public static void average(int sum){
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+((sum)/3));
    }
}
