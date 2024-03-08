package com.voya.collections.set;

import com.voya.collections.custom.Book;

import java.util.*;

public class BookSetDemo {

    public static void main(String[] args) {

        List<Book> books= Arrays.asList(
                new Book("Java","Oracle",500.00),
                new Book("Java","Oracle",500.00),
                new Book("Spring","Spring community",650.00),
                new Book("JDBC","pbk",550.00),
                new Book("Time Management","Allwin",500.00));

        for(Book book:books){
            System.out.println(book);
        }

        System.out.println("---------------------------------------------");
        Set<Book> bookSet = new TreeSet<>(books);
        for(Book book:bookSet){
            System.out.println(book);
        }


    }
}
