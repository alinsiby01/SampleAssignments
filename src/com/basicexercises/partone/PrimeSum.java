//66. Write a Java program to compute the sum of the first 100 prime numbers.

package com.basicexercises.partone;

public class PrimeSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 100; i++) {
            for (int j=2;j<i;j++){
            if (i % j == 0) {
                System.out.println(i);
                sum = sum+i; break;
            }
            }
        }
        System.out.println(sum);
    }
}