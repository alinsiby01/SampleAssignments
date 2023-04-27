//2. Write a Java program that reads a number in inches, converts it to meters.
//Note: One inch is 0.0254 meter.

package com.datatypesexercises;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for inch: ");
        double inches = scanner.nextDouble();
        double meter = inches*0.0254;
        System.out.println(inches+" inch is "+meter+" meters ");

    }
}
