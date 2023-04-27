//151. Write a Java program to find the value of specified expression.
//a) 101 + 0) / 3
//b) 3.0e-6 * 10000000.1
//c) true && true
//d) false && true
//e) (false && false) || (true && true)
//f) (false || false) && (true && true)

package com.basicexercises.parttwo;

public class SampleResult {
    public static void main(String[] args) {
        System.out.println((101 + 0) / 3);
        System.out.println(3.0e-6 * 10000000.1);
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println((false && false) || (true && true));
        System.out.println((false || false) && (true && true));
    }
}
