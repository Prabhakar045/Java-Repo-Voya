package com.voya.collections.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookDemoMain {

    public static void main(String[] args) {

        List<Book> books= Arrays.asList(
                new Book("Java","Oracle",500.00),
                new Book("Spring","Spring community",650.00),
                new Book("JDBC","pbk",550.00),
               new Book("Time Management","Allwin",500.00));

        System.out.println("bofore sorting");
        for (Book book:books){
            System.out.println(book);
        }

        System.out.println("after sorting");
        Collections.sort(books);
        for (Book book:books){
            System.out.println(book);
        }

    }
}
