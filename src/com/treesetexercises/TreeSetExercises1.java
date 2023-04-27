//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println(treeSet);
    }
}
