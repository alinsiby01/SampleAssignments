//14. Write a Java program of swap two elements in an array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercises14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the colours: ");
        ArrayList<String> fruits = new ArrayList<>();
        String fruit = scanner.nextLine().trim();
        while (!fruit.isEmpty()){
            fruits.add(fruit);
            fruit = scanner.nextLine();
        }
        System.out.println(fruits);
        int n = fruits.size();
        Collections.swap(fruits,0,n-1);
        System.out.println(fruits);
    }
}
