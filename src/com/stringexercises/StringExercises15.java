//15. Write a Java program to print current date and time in the specified format.

package com.stringexercises;

import java.time.LocalDate;
import java.time.LocalTime;

public class StringExercises15 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        System.out.println("Current date: "+date);

        LocalTime time= LocalTime.now();
        System.out.println("Current time: "+time);
    }
}
