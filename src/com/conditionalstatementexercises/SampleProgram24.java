//24. Write a java program to generate a following @'s triangle.
/*   @
    @@
   @@@
  @@@@
 @@@@@
@@@@@@ */

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        atTriangle(limit);
    }
    public static void atTriangle(int limit){
        int i;
        int x;
        int y;
        int sum = limit+limit-1;
        for (x = limit; x > 0; x--) {
            for (y = sum; y > 0; y--) {
                System.out.print(" ");
            }
            for (i =x-1; i < limit ; i++) {
                System.out.print("@" +" ");
            }
            System.out.println();
            sum=sum-2;
        }
    }
}
