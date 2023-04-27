//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

package com.datatypesexercises;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit : ");
        double f = scanner.nextDouble();
        double c = (( 5 *(f - 32.0)) / 9.0);
        System.out.println(f+" degree Fahrenheit is equal to "+c+" in Celsius");
    }
}
