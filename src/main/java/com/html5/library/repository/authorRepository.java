package com.html5.library.repository;

import com.html5.library.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/13/2016.
 */
public interface authorRepository extends CrudRepository<Author, Long>{

    @Query("SELECT a FROM #{#entityName} a order by RAND()")
    List<Author> findAuthorRandom();
}
