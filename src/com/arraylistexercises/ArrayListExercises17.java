//17. Write a Java program to empty an array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercises17 {
    public static void main(String[] args) {
       ArrayList<String> stringArrayList = readArrayList();
        empty(stringArrayList);
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
    public static void empty(List<String> stringArrayList){
        stringArrayList.removeAll(stringArrayList);
        System.out.println(stringArrayList);
    }
}
