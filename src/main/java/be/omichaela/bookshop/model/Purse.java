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
         private Color color;

        @Column(name = "material")
        private Material material;

        @Column(name = "size")
        private Size size;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;


        public Purse(Long id, String name, Color color, Material material, Size size, double price) {
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

        public Color getColor() {
        return color;
    }

        public void setColor(Color color) {
        this.color = color;
    }

        public Material getMaterial() {
        return material;
    }

        public void setMaterial(Material material) {
        this.material = material;
    }

        public void setSize(Size size) {
        this.size = size;
    }

        public Size getSize() {
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
