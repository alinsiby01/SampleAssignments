//15. Write a Java program to retrieve and remove the last element of a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises15 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println("The given TreeSet: "+treeSet);
        System.out.println("The first element: "+treeSet.last());
        treeSet.remove(treeSet.last());
        System.out.println("After removing the first element: "+treeSet);
    }
}
