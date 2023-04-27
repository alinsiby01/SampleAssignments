//18. Write a Java program to test an array list is empty or not.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises18 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = readArrayList();
        System.out.println(stringArrayList.isEmpty());
    }
    public static ArrayList<String> readArrayList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values: ");
        ArrayList<String> fruits = new ArrayList<>();
        String fruit = scanner.nextLine().trim();
        while (!fruit.isEmpty()){
            fruits.add(fruit);
            fruit = scanner.nextLine();
        }
        System.out.println(fruits);
        return fruits;
    }
}
