//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

package com.datatypesexercises;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000: ");
        int num = scanner.nextInt();
        int sum = 0;
        int r;
        int n =num;
        while (num > 0)
        {
            r = num % 10;
            sum = (sum) + r;
            num = num / 10;
        }
        System.out.println("The sum of all digits in "+n+" is "+sum);
    }
}
