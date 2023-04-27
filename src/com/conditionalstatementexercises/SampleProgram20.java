//20. Write a program in Java to print the Floyd's Triangle.
    /*  1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15*/

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        numberPattern(limit);
    }
    public static void numberPattern(int limit){
        int i;
        int j;
        int k = 1;
        for (i = 0; i <= limit; i++) {
            for (j =1; j <=i ; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
