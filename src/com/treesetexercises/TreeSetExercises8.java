//8. Write a Java program to compare two tree sets.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises8 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        System.out.println("TreeSet one "+treeSet);
        TreeSet<String> treeSet1 = new TreeSet<>(treeSet);
        System.out.println("TreeSet two "+treeSet1);
        System.out.println("The given TreeSet are equal: "+treeSet.equals(treeSet1));
    }
}
