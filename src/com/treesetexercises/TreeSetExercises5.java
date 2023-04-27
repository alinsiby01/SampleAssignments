//5. Write a Java program to get the first and last elements in a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println(treeSet);
        System.out.println("The first element: "+treeSet.first());
        System.out.println("The last element:"+treeSet.last());
    }
}
