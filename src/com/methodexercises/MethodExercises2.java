//2. Write a Java method to compute the average of three numbers.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        average(sum(a, b, c));
    }

    public static int sum(int n1, int n2, int n3) {
        return (n1 + n2 + n3);
    }

    public static void average(int sum) {
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + ((sum) / 3));
    }
}
