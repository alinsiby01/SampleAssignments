//9. Write a Java program that takes a year from user and print whether that year is a Jleap year or not.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year+" is a Leap Year");
        } else {
            System.out.println(year+" is not a Leap Year");
        }
    }
}
