//61. Write a Java program to reverse a word.

package com.basicexercises.partone;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the string:");
        String text = scanner.nextLine();
        int l = text.length();
        StringBuilder reverse = new StringBuilder();
        for (int i=(l-1);i>=0;i--){
            reverse.append(text.charAt(i));
        }
        System.out.println(reverse);
    }
}
