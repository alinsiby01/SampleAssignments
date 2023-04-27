//2. Write a Java program to iterate through all elements in a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        for (String colour:treeSet){
        System.out.println(colour);
        }
    }
}
