package com.Prograd.BooksStore.Application.Repository;

import com.Prograd.BooksStore.Application.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
