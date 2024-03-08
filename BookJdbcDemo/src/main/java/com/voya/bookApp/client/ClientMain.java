package com.voya.bookApp.client;



import com.voya.bookApp.exception.IdNotFoundException;
import com.voya.bookApp.model.Book;
import com.voya.bookApp.service.BookServiceImpl;
import com.voya.bookApp.service.IBoookService;
import com.voya.bookApp.util.BookDetails;

import java.util.List;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) throws IdNotFoundException {

        Scanner sc = new Scanner(System.in);
        List<Book> books= BookDetails.showBooks();
        Book book = new Book();

        IBoookService boookService = new BookServiceImpl();

        boookService.createBookTable();
        boookService.addBook(book);

        for(int i=0; i<5; i++) {
            String title = sc.nextLine();
            String author = sc.nextLine();
            String category = sc.nextLine();
            int bookId = sc.nextInt();
            double price = sc.nextDouble();

        }
/*
        System.out.println("Enter category: ");
        String category = sc.nextLine();

        try {
            List<Book> bookByCategory = boookService.getByCategory(category);
            for (Book book:bookByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }




        System.out.println("Enter author: ");
        String author = sc.nextLine();

        try {
            List<Book> bookByauthor = boookService.getBookByAuthorStartsWith(author);
            for (Book book:bookByauthor){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }


        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        try {
            List<Book> bookByPrice = boookService.getByPriceLessTahan(price);
            for (Book book:bookByPrice){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }


        System.out.println("Enter id: ");
        int id = sc.nextInt();

        try {
            List<Book> bookByPrice =  boookService.getById(id);
            for (Book book:bookByPrice){
                System.out.println(book);
            }
        } catch (IdNotFoundException e) {
            System.out.println("id not found "+e.getMessage());
        }


 */

    }
}
