package com.html5.library.web;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */
@Data
public class UserForm {
    @NotEmpty
    String username;
    @NotEmpty
    String password;
    @NotEmpty
    String name;
    @NotEmpty
    String email;
    @NotEmpty
    String phone;
    @NotEmpty
    String adress;
}
