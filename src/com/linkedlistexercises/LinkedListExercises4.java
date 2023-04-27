//4. Write a Java program to iterate a linked list in reverse order.

package com.linkedlistexercises;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExercises4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Orange");
        linkedList.add("Blue");
        Collections.reverse(linkedList);
        linkedList.forEach(list->System.out.println(list));
    }
}
