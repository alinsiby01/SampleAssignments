//6. Write a Java program to remove the third element from an array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();
        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("Enter the "+limit+" names: ");
        for (int i=0;i<limit;i++){
            namesList.add(scanner.next());
        }
        System.out.println(namesList);
        namesList.add(0,"alin");
        namesList.remove(2);
        System.out.println("After removing the 3rd element from array: ");
        System.out.println(namesList);
    }
}
