package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

@Entity
public class Book {

    @Id
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Column(name = "title")
    private String title;

    @NotBlank(message = "Language is mandatory")
    @Column(name = "language")
    private String language;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "volumeNumber")
    private String volumeNumber;

    @NotBlank(message = "Price is mandatory")
    @Column(name = "price")
    private double price;

    @NotBlank(message = "ISBN is mandatory")
    @Column(name = "ISBN")
    private String isbn;



    public Book(Long id, String title, String language, String author, String publisher, String volumeNumber, double price, String isbn) {

        super();
        this.id = id;
        this.title = title;
        this.language = language;
        this.author = author;
        this.publisher = publisher;
        this.volumeNumber = volumeNumber;
        this.price = price;
        this.isbn= isbn;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "this is a book object  with title: " + title;
    }
}

