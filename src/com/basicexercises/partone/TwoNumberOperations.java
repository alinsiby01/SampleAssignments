//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class TwoNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        operations(n1, n2);
    }
    public static void operations(int n1, int n2){
        System.out.println(n1 +"+" + n2 +" = "+(n1+n2));
        System.out.println(n1 +"-" + n2 +" = "+(n1-n2));
        System.out.println(n1 +"x" + n2 +" = "+(n1*n2));
        System.out.println(n1 +"/" + n2 +" = "+(n1/n2));
        System.out.println(n1 +"%" + n2 +" = "+(n1%n2));
    }
}
