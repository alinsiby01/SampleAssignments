//11. Write a Java program to print the area and perimeter of a circle.

package com.basicexercises.partone;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = scanner.nextDouble();
        area(r);
        perimeter(r);
    }

    public static void area(double r){
        double area = Math.PI * r * r;
        System.out.println("Area is "+area);
    }
    public static void perimeter(double r){
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter is "+perimeter);
    }
}
