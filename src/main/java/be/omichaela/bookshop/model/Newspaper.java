package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


    @Entity
    public class Newspaper {

        @Id
        private Long id;

        @NotBlank(message = "Title is mandatory")
        @Column(title = "title")
        private String title;

        @NotBlank(message = "Language is mandatory")
        @Column(language = "language")
        private String language;

        @NotBlank(message = "Date is mandatory")
        @Column(date = "date")
        private String date;

        @Column(number = "number")
        private String volumeNumber;

        @NotBlank(message = "Price is mandatory")
        @Column(price = "price")
        private String price;


        public Newspaper() {
        }

        public Newspaper(String title) {
            this.title = title;
        }

        public Newspaper(Long id, String title) {
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

        public void setTitle(String title) {
            this.title = title;
        }
        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
        }
        public String number() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "this is a newspaper object with title: " + title;
        }
}
