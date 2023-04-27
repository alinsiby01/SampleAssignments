//21. Write a program in Java to display the pattern like a diamond.
  /*        *
           ***
          *****
         *******
        *********
       ***********
      *************
       ***********
        *********
         *******
          *****
           ***
            *   */

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        diamondPattern(limit);
    }
    public static void diamondPattern(int limit){
        int i;
        int x;
        int y;
        int sum = limit-1;
        for (x = 1; x <= limit; x++) {
            for (y =sum; y > 0; y--) {
                System.out.print(" ");
            }
            for (i =1; i <=x ; i++) {
                System.out.print("*" +" ");
            }
            System.out.println();
            sum--;
        }
        for (x = limit; x >= 0; x--) {
            for (y =sum+1; y > 0; y--) {
                System.out.print(" ");
            }
            for (i =1; i <=x ; i++) {
                System.out.print("*" +" ");
            }
            System.out.println();
            sum++;
        }
    }
}
