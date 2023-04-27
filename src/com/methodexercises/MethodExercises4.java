//4. Write a Java method to count all vowels in a string.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        countVowels(text);
    }
    public static void countVowels(String text){
        int limit = text.length();
        int count =0;
        for (int i=0;i<limit;i++){
            if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'||text.charAt(i)=='A'||text.charAt(i)=='E'||text.charAt(i)=='I'||text.charAt(i)=='O'||text.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println("Number of Vowels in the string: "+count);
    }
}
