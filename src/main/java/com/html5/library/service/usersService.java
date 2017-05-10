package com.html5.library.service;

import com.html5.library.model.Users;
import com.html5.library.repository.usersRepository;
import com.html5.library.web.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */
@Service
public class usersService {
    @Autowired
    usersRepository repository;

    public Users createUser(UserForm form){
        return repository.save(new Users(form.getUsername(),form.getPassword(),form.getName(),form.getEmail(),form.getPhone(),form.getAdress()));
    }

    public Iterable findAll(){
        return repository.findAll();
    }

    public Users findOne(Long userID){
        return repository.findOne(userID);
    }
}
