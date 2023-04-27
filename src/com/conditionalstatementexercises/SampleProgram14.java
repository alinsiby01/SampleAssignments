//14. Write a program in Java to display the multiplication table of a given integer.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
