package com.voya.bookApp.reppsitory;

import com.voya.bookApp.exception.BookNotFoundException;
import com.voya.bookApp.exception.IdNotFoundException;
import com.voya.bookApp.model.Book;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class BookRepositoryImpl implements IBookRepository{

    //    private String title;
//    private String author;
//    private String category;
//    private int bookId;
//    private double price;

    String url="jdbc:mysql://localhost:3306/voyatraining";
    String username="root";
    String password="root";
    @Override
    public void createBookTable() {

        try {
            Connection  connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String sql = "create table book(book_title varchar(20), book_author varchar(30),book_category varchar(30), book_id int primary key, price double)";
            boolean result= statement.execute(sql);
            System.out.println(result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addBook(Book book) {

        String sql = "insert into boook values(?,?,?,?,?)";
        try (
            Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement(sql))
            {

                Scanner sc = new Scanner(System.in);
                for(int i=0; i<5; i++){
                    String title = sc.nextLine();
                    String author=sc.nextLine();
                    String category=sc.nextLine();
                    int bookId=sc.nextInt();
                    double price=sc.nextDouble();

                    statement.setString(1,title);
                    statement.setString(2,author);
                    statement.setString(3,category);
                    statement.setInt(4,bookId);
                    statement.setDouble(5,price);

                    boolean result = statement.execute();
                    System.out.println(result);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateBook(int bookId, double price) {

    }

    @Override
    public void deleteBook(int bookId) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> getBookByAuthorStartsWith(String author) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getByPriceLessTahan(double price) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<Book> getById(int bookId) throws IdNotFoundException {
        return null;
    }
}
