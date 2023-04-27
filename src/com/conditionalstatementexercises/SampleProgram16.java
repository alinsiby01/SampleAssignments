//16. Write a program in Java to display the pattern like right angle triangle with a number.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        numberPattern(limit);
    }
    public static void numberPattern(int limit){
        int i;
        int j;
        for (i = 0; i <= limit; i++) {
            for (j =1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
