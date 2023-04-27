//4. Write a Java program to convert minutes into a number of years and days.

package com.datatypesexercises;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        int hour = minutes/60;
        int day = hour/24;
        int year = day/356;
        int days = day%365;
        System.out.println(minutes+" minutes is approximately "+year+" years and "+(days)+" days");
    }
}
