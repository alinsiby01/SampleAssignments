//152. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

package com.basicexercises.parttwo;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd integer: ");
        int c = scanner.nextInt();
        System.out.println("Enter the 4th integer: ");
        int d = scanner.nextInt();
        if(a==b&&a==c&&a==d){
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("numbers are not equal");
        }
    }
}
