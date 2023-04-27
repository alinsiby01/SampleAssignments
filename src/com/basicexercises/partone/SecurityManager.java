//89. Write a Java program to check whether a security manager has already been established for the current application or not.

package com.basicexercises.partone;

public class SecurityManager {
    public static void main(String[] args) {
        System.out.println("Security manager has already been established for the current application or not.");
        System.out.println(System.getSecurityManager()+"\n");
    }
}
