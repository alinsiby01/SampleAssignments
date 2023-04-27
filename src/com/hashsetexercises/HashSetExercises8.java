//8. Write a Java program to convert a hash set to a tree set.

package com.hashsetexercises;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExercises8 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println("Given HashSet: ");
        System.out.println(names);
        System.out.println("Converted TreeSet: ");
        TreeSet<String> treeSet = new TreeSet<>(names);
        System.out.println(treeSet);
    }
}
