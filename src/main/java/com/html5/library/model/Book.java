package com.html5.library.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
@Entity
@Table(name = "Book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookID;
    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Category category;
    private String bookName;
    private String price;
    private String releaseDate;
    private String image;
    private Long click;
    private Long numberBook;

    @ManyToOne
    @JoinColumn(name = "publishingID")
    private Publishing publishing;

    @ManyToOne
    @JoinColumn(name = "authorID")
    private Author author;
    private String content;
}
