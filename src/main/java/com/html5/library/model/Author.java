package com.html5.library.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by NGOCHUY-PC on 12/13/2016.
 */
@Entity
@Table(name = "author")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long authorID;
    private String story;
    private String authorName;
    private String authorImage;

}
