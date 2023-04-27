//5. Write a Java program that keeps a number from the user and generates an integer
// between 1 and 7 and displays the name of the weekday.

package com.conditionalstatementexercises;

import java.util.Scanner;

public class SampleProgram5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = scanner.nextInt();
        getDayName(day);
    }

    private static void getDayName(int day) {
        switch (day){
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            default:
                System.out.println("Invalid day");
        }
    }
}
