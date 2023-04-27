//9. Write a Java program to convert a hash set to a List/ArrayList.

package com.hashsetexercises;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExercises9 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println("Given HashSet: ");
        System.out.println(names);
        System.out.println("Converted ArrayList: ");
        ArrayList<String> arrayList = new ArrayList<>(names);
        System.out.println(arrayList);
    }
}
