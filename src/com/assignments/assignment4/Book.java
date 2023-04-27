package com.assignments.assignment4;

public class Book {
        String title;
    public Book(String bookTitle) {
        this.title = bookTitle;
        }
        public boolean isBorrowed(int n) {
            if (n==1){
                return true;
            }
            else {
                return false;
            }
        }
        public String getTitle() {
            return title;
        }
        public static void main(String[] arguments) {
            Book example = new Book("The Da Vinci Code");
            System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
            System.out.println("Rented? (should be false): " + example.isBorrowed(0));
            System.out.println("Rented? (should be true): " + example.isBorrowed(1));
            System.out.println("Rented? (should be false): " + example.isBorrowed(0));
        }
}
