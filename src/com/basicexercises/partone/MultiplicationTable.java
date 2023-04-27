//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.

package com.basicexercises.partone;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        multiplicationTable(n);
    }

    public static void multiplicationTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
