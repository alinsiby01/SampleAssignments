//2. Write a Java program to iterate through all elements in a array list.

package com.arraylistexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of colours: ");
        int colours = scanner.nextInt();
        ArrayList<String> colourList = new ArrayList<>();
        for (int i=0;i<colours;i++){
            colourList.add(scanner.next());
        }
        for (String clr:colourList) {
            System.out.println(clr);
        }
    }
}
