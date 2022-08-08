package com.Prograd.BooksStore.Application.Service;

import com.Prograd.BooksStore.Application.Model.Book;

import java.util.*;

public interface service {
    Book saveBook(Book book);
    List<Book> getAllBook();
    Book getBookById(int id);
    Book updateBook(Book book,int id);
    void deleteBook(int id);
}
