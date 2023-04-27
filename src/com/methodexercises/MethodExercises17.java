//17. Write a Java method to count the number of digits in an integer that have the value 2. The integer may be assumed to be non-negative.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        countWords(text);
    }
    public static void countWords(String text) {
        int l = text.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (text.charAt(i) == '2') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count));
    }
}
