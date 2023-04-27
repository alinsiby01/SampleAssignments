//246. Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the
// ones digit n (<10). Write a Java program to convert 3 digits positive number in given format. For example, 234
// should be output as HHTTT1234 because it has 2 "hundreds", 3 "ten", and 4 of the ones. Go to the editor

package com.basicexercises.parttwo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 digit integer : ");
        int n = scanner.nextInt();
          int a = n%100;
          int b = a%10;
          int c = (n-a)/100;
          int d = (a-b)/10;
          for (int i =0; i<c;i++){
              System.out.print("H");
          }
          for (int j=0; j<d;j++){
              System.out.print("T");
          }
          for (int k=1;k<=b;k++){
              System.out.print(k);
          }
    }
}
