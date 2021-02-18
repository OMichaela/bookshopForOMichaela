package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Purse {

        @Id
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "color")
         private String color;

        @Column(name = "material")
        private String material;

        @Column(name = "size")
        private String size;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;


        public Purse(Long id, String name, String color, String material, String size, double price) {
            this.id = id;
            this.name = name;
            this.color = color;
            this.material = material;
            this.size = size;
            this.price = price;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
        this.name = name;
    }

        public String getName() {
            return name;
        }

        public String getColor() {
        return color;
    }

        public void setColor(String color) {
        this.color = color;
    }

        public String getMaterial() {
        return material;
    }

        public void setMaterial(String material) {
        this.material = material;
    }

        public void setSize(String size) {
        this.size = size;
    }

        public String getSize() {
        return size;
    }

        public double getPrice() {
        return price;
    }

        public void setPrice(double price) {
        this.price = price;
    }

        @Override
        public String toString() {
            return "this is a purse object with type: " + type;
        }
}
