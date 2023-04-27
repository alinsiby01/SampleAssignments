//16. Write a Java program to remove a given element from a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises16 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println(treeSet);
        treeSet.remove("Red");
        System.out.println("After removing the element: "+treeSet);
    }
}
