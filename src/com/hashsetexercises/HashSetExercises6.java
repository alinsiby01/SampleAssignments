//6. Write a Java program to clone a hash set to another hash set.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises6 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println("Given HashSet: ");
        System.out.println(names);
        HashSet<String> hashSet = new HashSet<>(names);
        System.out.println("Cloned HashSet: ");
        System.out.println(hashSet);
    }
}
