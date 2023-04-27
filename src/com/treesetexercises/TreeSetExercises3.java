//3. Write a Java program to add all the elements of a specified tree set to another tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println("Given TreeSet: "+treeSet);
        TreeSet<String> treeSet1 = new TreeSet<>(treeSet);
        System.out.println("New TreeSet: "+treeSet1);
    }
}
