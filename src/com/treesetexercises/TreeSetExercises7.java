//7. Write a Java program to get the number of elements in a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println(treeSet);
        System.out.println("The size of the TreeSet is "+treeSet.size());
    }
}
