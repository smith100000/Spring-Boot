package com.Prograd.BooksStore.Application.Model;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Book")

public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String bookName;



    @Column
    private String author;

    @Column
    private int price;



}
