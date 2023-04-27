//153. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

package com.basicexercises.parttwo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st double number : ");
        double a = scanner.nextDouble();
        System.out.println("Enter the 2nd double number : ");
        double b = scanner.nextDouble();
        System.out.println(a>0&&a<1&&b>0&&b<1);
    }
}
