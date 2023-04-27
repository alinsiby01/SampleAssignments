//6. Write a Java method to compute the sum of the digits in an integer.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number:");
        int num = scanner.nextInt();
        getDigitSum(num);
    }
    public static void getDigitSum(int num){
        int sum = 0;
        int r;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println("The sum of the digits is = "+sum);
    }
}
