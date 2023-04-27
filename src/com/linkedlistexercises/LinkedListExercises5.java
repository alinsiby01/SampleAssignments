//5. Write a Java program to insert the specified element at the specified position in the linked list.

package com.linkedlistexercises;

import java.util.LinkedList;

public class LinkedListExercises5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Blue");
        System.out.println("The given linked-list ");
        linkedList.forEach(list->System.out.println(list));
        linkedList.add(1,"White");
        System.out.println("After adding the element ");
        linkedList.forEach(list->System.out.println(list));
    }
}
