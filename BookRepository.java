package com.webgestus.publishnotes.repository;

/*

 * Online Notes Publishing Application using Java Spring Framework, MongoDb,  and Angular Js on Frontend
 * Author : Wembo Otepa Mulumba
 * Company : Webgestus Systems LLC

 */
import com.sun.xml.internal.bind.v2.model.core.ID;
import com.webgestus.publishnotes.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, Integer> {

   // find the Book by author name repo
    @Query(value = "{authorName:?0}")
    List<Book> findByAuthorName(String authorName);
    // find the Book by book name repo
    @Query(value = "{bookName:?0}")
    List<Book> findByBookName(String bookName);

}
