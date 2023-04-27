//16. Write a Java program to clone an array list to another array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values: ");
        ArrayList<String> fruits = new ArrayList<>();
        String fruit = scanner.nextLine().trim();
        while (!fruit.isEmpty()){
            fruits.add(fruit);
            fruit = scanner.nextLine();
        }
        System.out.println(fruits);
        Object stringArrayList = fruits.clone();
        System.out.println(stringArrayList);
    }
}
