//13. Write a program in Java to display the cube of the number upto given an integer.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int limit = scanner.nextInt();
        for (int i=1;i<=limit;i++){
            System.out.println("Number is "+i+" and cube of "+i+" is "+(i*i*i));
        }
    }
}
