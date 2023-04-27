//12. Write a Java program to remove all of the elements from a hash set

package com.hashsetexercises;

import java.util.HashSet;

public class HashSetExercises12 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);*/
        HashSet<String> names = new HashSet<>();
        names.add("Alin");
        names.add("Sanjay");
        names.add("Mary");
        names.add("Dini");
        System.out.println(names);
        names.clear();
        System.out.println(names);
        /*System.out.println("Enter the names: ");
        String name = scanner.nextLine().trim();
        while (!name.isEmpty()) {
            names.add(name);
            name = scanner.nextLine();
        }
        System.out.println(names);*/
    }
}
