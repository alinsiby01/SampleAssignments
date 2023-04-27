//4. Write a Java program to empty a hash set.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises4 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
