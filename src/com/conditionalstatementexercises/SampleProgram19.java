//19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
  /*   1
      2 2
     3 3 3
    4 4 4 4 */

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the limit:");
        int limit = scanner.nextInt();
        numberPyramid(limit);
    }
    public static void numberPyramid(int limit){
        int i;
        int x;
        int y;
        int sum = limit+limit-1;
        for (x = 1; x <= limit; x++) {
            for (y =sum; y > 0; y--) {
                System.out.print(" ");
            }
            for (i =1; i <=x ; i++) {
                System.out.print(x +" ");
            }
            System.out.println(" ");
            sum--;
        }
    }
}
