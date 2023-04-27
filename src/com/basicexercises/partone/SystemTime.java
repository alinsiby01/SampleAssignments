//47. Write a Java program to display the current date time in specific format.

package com.basicexercises.partone;

import java.time.LocalDate;
import java.time.LocalTime;

public class SystemTime {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalTime time= LocalTime.now();
        System.out.println("Now: " +date+"\t"+time);
        System.out.println(System.currentTimeMillis());
    }
}
