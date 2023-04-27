//46. Write a Java program to reverse every word in a string using methods.

package com.stringexercises;

import java.util.Scanner;

public class StringExercises46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number or string:");
        String text = scanner.nextLine();
        int l = text.length();
        StringBuilder reverse = new StringBuilder();
        for (int i=(l-1);i>=0;i--){
            reverse.append(text.charAt(i));
        }
        System.out.println(reverse);
    }
}
