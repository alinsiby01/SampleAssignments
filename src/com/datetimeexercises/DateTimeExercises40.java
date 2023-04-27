//40. Write a Java program to display current date without time and current time without date.

package com.datetimeexercises;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeExercises40 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
