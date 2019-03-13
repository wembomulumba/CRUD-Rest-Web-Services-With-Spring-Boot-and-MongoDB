package com.webgestus.publishnotes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/*

 * Online Notes Publishing Application using Java Spring Framework, MongoDb,  and Angular Js on Frontend
 * Author : Wembo Otepa Mulumba
 * Company : ABWEB Systems LLC

 */

// MODEL
@Document(collection="Book")
public class Book   {

    @Id
    private int id;
    @Indexed(name="bookName")
    private String bookName;
    @Indexed(name="authorName")
    private String authorName;
    @Indexed(name="authorNotes")
    private String authorNotes;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorNotes() {
        return authorNotes;
    }

    public void setAuthorNotes(String authorNotes) {
        this.authorNotes = authorNotes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorNotes='" + authorNotes + '\'' +
                '}';
    }
}
