//9. Write a Java program to find the numbers less than 7 in a tree set.

package com.treesetexercises;

import java.util.TreeSet;

public class TreeSetExercises9 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(6);
        numbers.add(8);
        System.out.println(numbers);
        for (int i=0;i<numbers.size();i++){
            if(numbers.contains(1)){
            }
        }
    }
}
