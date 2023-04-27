package com.newwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEg {
    public static void main(String[] args) {
      average();
    }
    public static void average(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum =0;
        for (int i=0; i<limit;i++){
            System.out.println("Enter the elements"+i+1);
            numberList.add(scanner.nextInt());
            sum = sum+numberList.get(i);
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average= "+(sum/limit));
    }
}
