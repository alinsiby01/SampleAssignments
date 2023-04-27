//7. Write a Java program to convert a hash set to an array.

package com.hashsetexercises;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExercises7 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println("Given HashSet: ");
        System.out.println(names);
        System.out.println("Converted Array: ");
        String[] arr = names.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }
}
