package com.html5.library.web;

import com.html5.library.model.Author;
import com.html5.library.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/13/2016.
 */
@RestController
@RequestMapping(value = "/author")
public class authorController {
    @Autowired
    authorService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{authorID}",method = RequestMethod.GET)
    public Author findOne(@PathVariable(value = "authorID") Long authorID){
        return service.findOne(authorID);
    }

    @RequestMapping(value = "/authorRandom",method = RequestMethod.GET)
    public Author findOne(){
        return service.findAllRandom();
    }

}
