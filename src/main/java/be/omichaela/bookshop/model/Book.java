package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private Long id;
    @Column(name = "BOOKTITLE")
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "this is a book object  with title: " + title;
    }
}
