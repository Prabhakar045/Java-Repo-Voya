package com.voya.oops;

public class Book {


    String bookTitle;
    String author;
    double price;
    String category;

    public Book(String bookTitle, String author, double price, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    void getBookDeatils(){
        System.out.println("Title: "+bookTitle);
        System.out.println("Book Author: "+author);
        System.out.println("Book price: "+price);
        System.out.println("Book category: "+category);
    }

    void checkingBookType(){
        if(price>500){
            System.out.println(bookTitle+ " Premium books!");
        }else {
            System.out.println(bookTitle+ " Standard books");
        }
    }
}
