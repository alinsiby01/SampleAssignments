//10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}
