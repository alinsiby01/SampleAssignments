//14. Write a Java program to print an American flag on the screen

package com.basicexercises.partone;

public class AmericanFlag {
    public static void main(String[] args) {
        printStars();
        printStar();
        printStars();
        printStar();
        printStars();
        printStar();
        printStars();
        printStar();
        printStars();
        printLine();
    }
    public static void printStars(){
        System.out.println("* * * * * * ==================================");
    }
    public static void printStar(){
        System.out.println(" * * * * *  ==================================");
    }
    public static void printLine(){
        for (int i=1; i<=6;i++) {
            System.out.println("==============================================");
        }
    }
}
