package com.html5.library.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */
@Entity
@Table(name = "publishing")
@Data
public class Publishing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long publishingID;
    private String publishingName;
    private String describe;
}
