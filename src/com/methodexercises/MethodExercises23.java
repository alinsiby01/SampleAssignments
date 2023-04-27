//23. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not.
//Return true if each character of the string is a vowel, otherwise return false.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        checkVowels(text);
    }

    public static void checkVowels(String text) {
        int limit = text.length();
        int count = 0;
        for (int i = 0; i < limit; i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                count = 1;
            } else {
                count = 0;
            }
        }
        if (count == 1) {
            System.out.println("Check all the characters of the said string are vowels or not!  true");
        } else {
            System.out.println("Check all the characters of the said string are vowels or not!  false");
        }
    }
}
