package com.newwork;

import java.util.Scanner;

public class ReadWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = scanner.nextLine();
        int n = text.length();
        int count =0;
        for(int i =0;i<n;i++){
            if(text.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
