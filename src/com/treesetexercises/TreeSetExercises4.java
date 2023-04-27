//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

package com.treesetexercises;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        treeSet.add("Pink");
        for (String colour:treeSet){
            System.out.print(colour+",");
        }
        Iterator<String> it = treeSet.descendingIterator();
        // Print list elements in reverse order
        System.out.println("\nElements in Reverse Order:");
        while (it.hasNext()) {
            System.out.print(it.next()+",");
        }
    }
}
