package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Date;


    @Entity
    public class Newspaper {

        @Id
        private Long id;

        @NotBlank(message = "Title is mandatory")
        @Column(name = "title")
        private String title;

        @NotBlank(message = "Language is mandatory")
        @Column(name = "language")
        private String language;

        @NotBlank(message = "Date is mandatory")
        @Column(name = "editionDate")
        private Date editionDate;

        @Column(name = "number")
        private String number;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;


        public Newspaper() {
        }

        public Newspaper(String title) {
            this.title = title;
        }

        public Newspaper(Long id, String title, String language, Date editionDate, String number, double price) {
            this.id = id;
            this.title = title;
            this.language = language;
            this.editionDate = editionDate;
            this.number = number;
            this.price = price;

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


        public Date getEditionDate() {
            return editionDate;
        }

        public void setEditionDate(Date editionDate) {
            this.editionDate = editionDate;
        }
        }
        public String number() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "this is a newspaper object with title: " + title;
        }
}
