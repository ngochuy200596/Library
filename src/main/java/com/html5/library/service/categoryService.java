package com.html5.library.service;

import com.html5.library.model.Category;
import com.html5.library.repository.categoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
@Service
public class categoryService {
    @Autowired
    categoryRepository repository;

    public Iterable<Category> findAll(){
        return repository.findAll();
    }

    public Category findOne(Long categoryID){
        return repository.findOne(categoryID);
    }

    public List<Category> findCategory(Long parentID){
        return repository.findCategory(parentID);
    }

    public ResponseEntity delete(Long categoyID){
        if(repository.exists(categoyID)){
            repository.delete(categoyID);
            return new ResponseEntity(HttpStatus.OK);
        }return new ResponseEntity(HttpStatus.FAILED_DEPENDENCY);
    }
}
