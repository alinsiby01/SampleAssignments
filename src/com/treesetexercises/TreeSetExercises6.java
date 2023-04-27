//6. Write a Java program to clone a tree set list to another tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises6 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println(treeSet);
        TreeSet<String> treeSet1 = (TreeSet<String>) treeSet.clone();
        System.out.println(treeSet1);
    }
}
