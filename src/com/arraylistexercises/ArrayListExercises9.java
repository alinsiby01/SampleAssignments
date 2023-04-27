//9. Write a Java program to copy one array list into another.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises9 {
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
        ArrayList<String> stringArrayList = new ArrayList<>(fruits);
        System.out.println(stringArrayList);
    }
}
