//73. Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.

package com.arrayexercises;

import java.util.Arrays;

public class ArrayExercises73 {
    public static void main(String[] args) {
        int[] num1 = {3, 5, 6, 9, 8, 7};
        int[] num2 = {5, 0, 1, 2, 3, 4, -2};
        System.out.println("The given arrays are ");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        Arrays.sort(num1);
        Arrays.sort(num2);
        System.out.println("Sorted arrays are ");
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
}
