package com.html5.library.repository;

import com.html5.library.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
public interface categoryRepository extends CrudRepository<Category, Long>{

    @Query("SELECT c FROM #{#entityName} c  WHERE c.parentID = ?1")
    public List<Category> findCategory(Long parentID);

}
