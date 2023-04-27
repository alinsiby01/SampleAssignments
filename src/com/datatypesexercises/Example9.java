//9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product,
// the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum
// (smaller of the two integers).

package com.datatypesexercises;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd integer: ");
        int b = scanner.nextInt();
        System.out.println("Sum of two integers: "+(a+b));
        System.out.println("Difference of two integers: "+(a-b));
        System.out.println("Product of two integers: "+(a*b));
        System.out.println("Average of two integers: "+((a+b)/2.0));
        System.out.println("Distance of two integers: "+Math.abs(a-b));
        System.out.println("Max integer: "+Math.max(a,b));
        System.out.println("Min integer: "+Math.min(a,b));
    }
}
