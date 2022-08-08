package com.Prograd.BooksStore.Application.Service;

import com.Prograd.BooksStore.Application.Model.Book;
import com.Prograd.BooksStore.Application.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceImpl implements service{
    @Autowired

    private BookRepo bookRepo;

    public ServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return (List<Book>) bookRepo.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepo.findById(id).orElseThrow();
    }

    @Override
    public Book updateBook(Book book, int id) {
        Book existingBook=bookRepo.findById(id).orElseThrow();
        existingBook.setBookName(book.getBookName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        bookRepo.save(existingBook);

        return existingBook;
    }

    @Override
    public void deleteBook(int id) {
        bookRepo.findById(id).orElseThrow();
        bookRepo.deleteById(id);


    }
}
