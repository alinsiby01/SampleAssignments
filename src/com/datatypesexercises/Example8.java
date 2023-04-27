//8. Write a Java program that reads a number and display the square, cube, and fourth power.

package com.datatypesexercises;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Square: "+(num*num));
        System.out.println("Cube: "+(num*num*num));
        System.out.println("Fourth power: "+Math.pow(num,4));
    }
}
