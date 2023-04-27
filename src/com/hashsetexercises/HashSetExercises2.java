//2. Write a Java program to iterate through all elements in a hash list.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
