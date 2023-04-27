//27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       checkInteger(num);
    }
    public static void checkInteger(int num){
        if(num==0){
            System.out.println("Number is zero");
        } else if (num>0) {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
