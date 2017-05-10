package com.html5.library.web;

import com.html5.library.model.Book;
import com.html5.library.model.Category;
import com.html5.library.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
@RestController
@RequestMapping(value = "/book")
public class bookController {
    @Autowired
    bookService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/ReleaseDate",method = RequestMethod.GET)
    public List<Book> findReleaseDate(){
        return service.findreleaseDate();
    }

    @RequestMapping(value = "/{bookID}",method = RequestMethod.GET)
    public Book findOne(@PathVariable(value = "bookID") Long bookID){
        return service.findOne(bookID);
    }

    @RequestMapping(value = "/BookHot",method = RequestMethod.GET)
    public Book findBookHot(){
        return service.findBookHot();
    }


    @RequestMapping(value = "BookByCategory/{categoryID}",method = RequestMethod.GET)
    public List<Book> findByCategory(@PathVariable(value = "categoryID") Long categoryID){
        return service.findByCategory(categoryID);
    }

    @RequestMapping(value = "BookByAuthor/{authorID}",method = RequestMethod.GET)
    public List<Book> findByAuthor(@PathVariable(value = "authorID") Long authorID){
        return service.findByAuthor(authorID);
    }

    @RequestMapping(value = "/{bookID}",method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(value = "bookID") Long bookID){
        return service.delete(bookID);
    }


}
