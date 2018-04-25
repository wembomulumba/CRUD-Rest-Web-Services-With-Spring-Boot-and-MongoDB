package com.webgestus.publishnotes.resource;
/*

* Online Notes Publishing Application using Java Spring Framework, MongoDb,  and Angular Js on Frontend
* Author : Wembo Otepa Mulumba
* Company : Webgestus Systems LLC

 */
import com.webgestus.publishnotes.model.Book;
import com.webgestus.publishnotes.repository.BookRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @RequestMapping("/hello")
    public String welcome(){

        return "index";
    }

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        repository.save(book);
        return "NoteBook has Been Created with id : " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return repository.findAll();
    }



    @GetMapping("/findAllBooks/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return repository.findById(id);
    }

    // find notes by author : very important part of the system
    @GetMapping("/author/{authorName}")
    public List<Book> getByAuthor(@PathVariable("authorName") String authorName){
        List<Book> book = this.repository.findByAuthorName(authorName);

        return book;
    }

    // find notes by Book/Notes Title : very important part of the system
    @GetMapping("/title/{bookName}")
    public List<Book> getByTitle(@PathVariable("bookName") String bookName){
        List<Book> book = this.repository.findByBookName(bookName);

        return book;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        repository.deleteById(id);
        return "Note deleted with id : " + id;
    }



}
