package com.html5.library.repository;

import com.html5.library.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by NGOCHUY-PC on 12/9/2016.
 */
    public interface bookRepository extends CrudRepository<Book, Long> {
        @Query("SELECT b FROM #{#entityName} b WHERE b.releaseDate BETWEEN '2017-11-01' AND '2017-12-31' ")
        public List<Book> findReleaseDate();

        @Query("SELECT b FROM #{#entityName} b LEFT JOIN b.category c WHERE c.categoryID = ?1")
        List<Book> findbyCategory(Long categoryID);

    @Query("SELECT b FROM #{#entityName} b LEFT JOIN b.author a WHERE a.authorID = ?1")
    List<Book> findbyAuthor(Long authorID);

    @Query("SELECT b FROM #{#entityName} b WHERE b.click = (SELECT MAX(b2.click) FROM #{#entityName} b2)")
    Book findBookHot();


//    @Query("SELECT b FROM #{#entityName} b WHERE b.categoryID order by RAND()")
//    public List<Book> findAllRandom();

//    @Query("SELECT b FROM #{#entityName} b order by RAND()")
//    public List<Book> findAuthor();


}
