//86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3
// and add 1 if n is odd, repeat the process until n = 1.

package com.basicexercises.partone;
import java.util.Scanner;

public class GetN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter a number : ");
            value = scanner.nextInt();
            if(value% 2 == 0){
                int a = value/2;
                System.out.println(a);
            }
            else {
                int b = (value*3)+1;
                System.out.println(b);
            }
        }
        while (value != 1);
        System.out.println("n = "+1);
    }
}
