package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class PerpetualCalendar {

        @Id
        private Long id;
        @Column(name = "name")
        private String name;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;

        @NotBlank(message = "Language is mandatory")
        @Column(name = "language")
        private String language;



        public PerpetualCalendar(Long id, String name, double price, String language) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.language = language;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public String getLanguage() {
        return language;
        }

        public void setLanguage(String language) {
        this.language = language;
    }


        public double getPrice() {
        return price;
    }

        public void setPrice(double price) {
        this.price = price;
    }

        @Override
        public String toString() {
            return "this is a perpetual calendar object with type: " + type;
        }}
