//247. Write a Java program which accepts three integers and check whether sum of the first two given integers
// is greater than third one. Three integers are in the interval [-231, 231 ].

package com.basicexercises.parttwo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers(a,b,c) : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s = a + b;
            System.out.println(s>c);
    }
}
