//15. Write a Java program to swap two variables.

package com.basicexercises.partone;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        swap(a,b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("1st number = "+a+"\n"+"2nd number = "+b);
    }
}
