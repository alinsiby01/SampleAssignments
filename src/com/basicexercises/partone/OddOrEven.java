//49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

package com.basicexercises.partone;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
