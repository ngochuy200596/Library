package com.html5.library.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
@Entity
@Table(name="category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryID;
    private String categoryName;
    private Long parentID;
    private String categoryImage;
}
