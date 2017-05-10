package com.html5.library.repository;

import com.html5.library.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NGOCHUY-PC on 12/19/2016.
 */
public interface usersRepository extends CrudRepository<Users, Long> {
}
