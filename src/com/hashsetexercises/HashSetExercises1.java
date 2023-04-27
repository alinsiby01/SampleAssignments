//1. Write a Java program to append the specified element to the end of a hash set.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println(names);
        names.add("Jio");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
