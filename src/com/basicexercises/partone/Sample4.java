//64. Write a Java program that accepts two integer values between 25 and 75
// and return true if there is a common digit in both numbers.

package com.basicexercises.partone;
import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer values between 25 and 75");
        System.out.println("Enter the 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = scanner.nextInt();
            if (a < 25 ||b > 75) {
                System.out.println("false");
            }else {
                    int x = a % 10;
                    int y = b % 10;
                    a /= 10;
                    b /= 10;
                    System.out.println(a == b || a == y || x == b || x == y);
                }
                }
}
