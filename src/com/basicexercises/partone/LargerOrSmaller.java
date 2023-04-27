//Write a Java program that accepts two integer values from the user and return the larger values.
// However, if the two values are the same, return 0 and return the smaller value if the two values
// have the same remainder when divided by 6.

package com.basicexercises.partone;

import java.util.Scanner;

public class LargerOrSmaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st value : ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd value : ");
        int b = scanner.nextInt();
        getResult(a,b);
    }

    public static void getResult(int a, int b){
        if(a==b){
            System.out.println("Result = "+0);
        } else if (a%6==b%6) {
            System.out.println("The smallest value is " + Math.min(a, b));
        } else {
            System.out.println("The largest value is " + Math.max(a, b));
        }
    }
}
