//32. Write a Java program to compare two numbers.

package com.basicexercises.partone;

import java.util.Scanner;

public class CompareTwoNumbers {
        public static void main( String[] args ) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input first number: ");
            int n1 = scanner.nextInt();

            System.out.print("Input second number: ");
            int n2 = scanner.nextInt();
            compare(n1,n2);

        }
        public static void compare(int n1,int n2){
            if ( n1 == n2 )
                System.out.println(n1+"=="+n2);
            if ( n1 != n2 )
                System.out.println(n1+ "!="+n2);
            if ( n1 < n2 )
                System.out.println(n1+" < "+n2);
            if ( n1 > n2 )
                System.out.println(n1+" > "+n2);
            if ( n1 <= n2 )
                System.out.println(n1+" <= "+n2);
            if ( n1 >= n2 )
                System.out.println(n1+" >= "+n2);
        }
}
