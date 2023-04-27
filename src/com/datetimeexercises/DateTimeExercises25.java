//25. Write a Java program to get the information of current/given year.

package com.datetimeexercises;

import java.time.Year;


public class DateTimeExercises25 {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("Current Year: " + year);
        boolean leap = year.isLeap();
        System.out.println("Is current year leap year? " + leap);
        int length = year.length();
        System.out.println("Length of the year: " +length+" days");
    }
}
