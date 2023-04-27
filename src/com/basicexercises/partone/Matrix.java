//120. Write a Java program that searches a value in an m x n matrix.

package com.basicexercises.partone;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        System.out.println("Enter the elements: ");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }

    }
}
