package com.html5.library.web;

import com.html5.library.model.Users;
import com.html5.library.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */

@RestController
@RequestMapping(value = "/users")
public class userController {
    @Autowired
    usersService service;

    @RequestMapping(method = RequestMethod.POST)
    public Users createCustomer(@Valid @RequestBody UserForm form, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new FormException(bindingResult);
        }
        return service.createUser(form);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll(){
        return service.findAll();
    }

}
