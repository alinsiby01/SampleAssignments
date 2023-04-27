//33. Write a Java program and compute the sum of the digits of an integer.

package com.basicexercises.partone;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number:");
        int num = scanner.nextInt();
        int sum = 0;
        int r;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println("The sum of the digits is = "+sum);
    }
}
