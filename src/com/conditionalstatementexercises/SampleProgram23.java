//23. Write a java program to generate a following *'s triangle.
/*  *****
     ****
      ***
       **
        *
 */

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        starTriangle(limit);
    }
    public static void starTriangle(int limit){
        int i;
        int x;
        int y;
        int sum = 0;
        for (x = limit; x > 0; x--) {
            for (y = sum; y > 0; y--) {
                System.out.print(" ");
            }
            for (i =0; i < x ; i++) {
                System.out.print("*" +" ");
            }
            System.out.println();
            sum=sum+2;
        }
    }
}
