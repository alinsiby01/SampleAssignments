//1. Write a Java method to find the smallest number among three numbers.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        smallest(a,b,c);
    }
    public static void smallest(int a,int b,int c){
        System.out.println("The smallest value is "+Math.min(Math.min(a, b), c));
    }
}
