//3. Take three numbers from the user and print the greatest number.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int c = scanner.nextInt();
        findGreatest(a,b,c);
    }
    public static void findGreatest(int a,int b,int c) {
        String greatest = "The greatest number is ";
        if (a > b && a > c) {
            System.out.println(greatest + a);
        } else if (b > a && b > c) {
            System.out.println(greatest+ b);
        } else {
            System.out.println(greatest+ c);
        }
    }
}
