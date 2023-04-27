//45. Write a Java program to print yyyy-MM-dd, HH:mm:ss, yyyy-MM-dd HH:mm:ss, E MMM yyyy HH:mm:ss.SSSZ and HH:mm:ss,Z, 
// format pattern for date and time.

package com.datetimeexercises;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeExercises45 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Time time = Time.valueOf(LocalTime.now());
        System.out.println(time);
        System.out.println(localDate+" "+time);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

    }
}
