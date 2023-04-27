//1. Write a Java program to append the specified element to the end of a linked list.

package com.linkedlistexercises;

import java.util.LinkedList;

public class LinkedListExercises1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Blue");
        System.out.println("The linked list: " +linkedList);
    }
}
