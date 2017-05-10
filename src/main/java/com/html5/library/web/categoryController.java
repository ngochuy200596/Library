package com.html5.library.web;

import com.html5.library.model.Category;
import com.html5.library.service.categoryService;
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
@RequestMapping(value = "/category")
public class categoryController {
    @Autowired
    categoryService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Category> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{categoryID}" ,method = RequestMethod.GET)
    public Category findOne(@PathVariable(value = "categoryID") Long categoryID){
        return service.findOne(categoryID);
    }

    @RequestMapping(value = "parent/{prentID}" ,method = RequestMethod.GET)
    public List<Category> findCategory(@PathVariable(value = "prentID") Long parentID){
        return service.findCategory(parentID);
    }

    @RequestMapping(value = "/{categoryID}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(value = "categoryID") Long categoryID){
        return service.delete(categoryID);
    }
}
