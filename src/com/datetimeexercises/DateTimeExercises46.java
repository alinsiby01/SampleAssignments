//46. Write a Java program to count the number of days between two given years.

package com.datetimeexercises;

import java.time.Year;
import java.util.Scanner;


public class DateTimeExercises46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the staring year: ");
        Year sYear = Year.of(scanner.nextInt());
        System.out.println("Enter the ending year: ");
        Year eYear = Year.of(scanner.nextInt());
        /*Year year = Year.now();
        System.out.println("Current Year: " + year);
        boolean leap = year.isLeap();
        System.out.println("Is current year leap year? " + leap);*/
        int n = eYear.compareTo(sYear);
        for (int i = 0; i<=n; i++){
            System.out.println("-");}
        int length = sYear.length();
        System.out.println("Length of the year: " +length+" days");
    }
}
