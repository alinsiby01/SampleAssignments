//13. Write a Java program to print the area and perimeter of a rectangle.

package com.basicexercises.partone;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        double w = scanner.nextDouble();
        System.out.println("Enter the Height: ");
        double h = scanner.nextDouble();
        area(w,h);
        perimeter(w,h);
    }
    public static void area(double w, double h){
        double area = w * h;
        System.out.println("Area is "+area);
    }
    public static void perimeter(double w, double h){
        double perimeter = 2 * (w + h);
        System.out.println("Perimeter is "+perimeter);
    }
}
