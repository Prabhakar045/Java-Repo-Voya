package com.voya.oops;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Java","Oracle",550.00,"Programming Language");
        Book book1 = new Book("C","abc",450.00,"Programming Language");

        book.getBookDeatils();
        System.out.println("\n");
        book1.getBookDeatils();

        System.out.println("\n");
         book.checkingBookType();
         book1.checkingBookType();

    }
}
