package com.voya.bookApp.reppsitory;

import com.voya.bookApp.exception.BookNotFoundException;
import com.voya.bookApp.exception.IdNotFoundException;
import com.voya.bookApp.model.Book;

import java.util.List;

public interface IBookRepository {

    void createBookTable();
    void addBook(Book book);
    void updateBook(int bookId, double price);
    void deleteBook(int bookId);

    List<Book> getAll();
    List<Book> getBookByAuthorStartsWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessTahan(double price)throws BookNotFoundException;
    List<Book> getById(int bookId)throws IdNotFoundException;
}
