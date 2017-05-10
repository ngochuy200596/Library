package com.html5.library.service;

import com.html5.library.model.Book;
import com.html5.library.model.Category;
import com.html5.library.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
@Service
public class bookService {
    @Autowired
    bookRepository repository;

    public Iterable<Book> findAll(){
        return repository.findAll();
    }

    public Book findOne(Long bookID){
        return repository.findOne(bookID);
    }

    public List<Book> findreleaseDate(){
        return repository.findReleaseDate();
    }

    public Book findBookHot(){
        return repository.findBookHot();
    }

    public List<Book> findByCategory(Long categeyID){
        return repository.findbyCategory(categeyID);
    }

    public List<Book> findByAuthor(Long authorID){
        return repository.findbyAuthor(authorID);
    }

    public ResponseEntity delete(Long bookID){
        if(repository.exists(bookID)){
            repository.delete(bookID);
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FAILED_DEPENDENCY);
    }


}
