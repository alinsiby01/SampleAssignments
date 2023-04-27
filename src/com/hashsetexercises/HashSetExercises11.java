//11. Write a Java program to compare two sets and retain elements which are same on both sets.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises11 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println(names);
        HashSet<String> hashSet = new HashSet<>(names);
        hashSet.add("Jio");
        System.out.println(hashSet);
        names.retainAll(hashSet);
        System.out.println(names);
    }
}
