//1. Write a Java program to get the character at the given index within the String.

package com.stringexercises;

public class StringExercises1 {
    public static void main(String[] args) {
      getCharacterByIndex();
    }
    public static void getCharacterByIndex(){
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        char index1 = str.charAt(0);
        char index2 = str.charAt(10);
        char index3 = str.charAt(14);
        System.out.println("The character at position 0 is " +
                index1);
        System.out.println("The character at position 10 is " +
                index2);
        System.out.println("The character at position 14 is " +
                index3);
    }
}
