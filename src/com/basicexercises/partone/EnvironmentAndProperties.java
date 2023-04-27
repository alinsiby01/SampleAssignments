//88. Write a Java program to get the current system environment and system properties.

package com.basicexercises.partone;

public class EnvironmentAndProperties {
    public static void main(String[] args) {
        System.out.println("Current system environment ");
        System.out.println(System.getenv()+"\n");
        System.out.println("Current system properties ");
        System.out.println(System.getProperties());
    }
}
