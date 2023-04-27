//5. Write a Java method to count all words in a string.

package com.methodexercises;

import java.util.Scanner;

public class MethodExercises5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        countWords(text);
    }
    public static void countWords(String text){
        int l = text.length();
        int count =0;
        for(int i =0;i<l;i++){
            if(text.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Number of words in the string: "+(count+1));
    }
}
