//6. Write a Java program to insert elements into the linked list at the first and last position.

package com.linkedlistexercises;

import java.util.LinkedList;

public class LinkedListExercises6 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Blue");
        System.out.println("The given linked-list ");
        linkedList.forEach(list->System.out.println(list));
        linkedList.add(0,"White");
        linkedList.add("Black");
        System.out.println("After adding the element ");
        linkedList.forEach(list->System.out.println(list));
    }
}
