//19. Write a Java program to trim the capacity of an array list the current list size.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises19 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = readArrayList();
        stringArrayList.trimToSize();
        System.out.println(stringArrayList);
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
