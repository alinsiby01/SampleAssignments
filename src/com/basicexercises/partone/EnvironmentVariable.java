//90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
//91. Write a Java program to measure how long some code takes to execute in nanoseconds.

package com.basicexercises.partone;

public class EnvironmentVariable {
    public static void main(String[] args) {

        long start = System.nanoTime();
        System.out.println(start);
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
        System.out.println(System.nanoTime());
        System.out.println( System.nanoTime()-start);
    }
}
