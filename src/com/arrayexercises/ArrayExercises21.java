//21. Write a Java program to convert an ArrayList to an array.

package com.arrayexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExercises21
  {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the limit: ");
          int l = scanner.nextInt();
          ArrayList<String> names = new ArrayList<>();
          for (int i = 0; i < l; i++) {
              System.out.println("Enter the name " + (i + 1));
              String name = scanner.next();
              names.add(name);
          }
          System.out.println("The given names are ");
          for (String n:names) {
              System.out.print(n+",");
          }
          String[] stringArray = new String[l];
          names.toArray(stringArray);
          System.out.print("\nThe given names are in array ");
          for (String str:stringArray) {
              System.out.print(str+",");
          }
      }
}
