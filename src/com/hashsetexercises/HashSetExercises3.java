//3. Write a Java program to get the number of elements in a hash set.

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises3 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println("Given hashset is "+names);
        System.out.println("Number of elements: "+names.size());
    }
}
