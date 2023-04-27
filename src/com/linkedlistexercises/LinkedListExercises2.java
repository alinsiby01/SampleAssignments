//2. Write a Java program to iterate through all elements in a linked list.

package com.linkedlistexercises;

import java.util.LinkedList;

public class  LinkedListExercises2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Blue");
        linkedList.forEach(list-> System.out.println(list));
    }
}
