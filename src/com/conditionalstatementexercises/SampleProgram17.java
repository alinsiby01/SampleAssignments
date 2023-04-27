//17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows :
     /* 1
        22
        333
        4444 */

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram17 {
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
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
