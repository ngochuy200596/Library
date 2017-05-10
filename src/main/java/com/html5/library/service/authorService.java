package com.html5.library.service;

import com.html5.library.model.Author;
import com.html5.library.repository.authorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/13/2016.
 */
@Service
public class authorService {
    @Autowired
    authorRepository repository;

    public Iterable findAll(){
        return repository.findAll();
    }

    public Author findOne(Long authorID){
        return repository.findOne(authorID);
    }

    public Author findAllRandom(){
        return repository.findAuthorRandom().get(0);
    }
}
