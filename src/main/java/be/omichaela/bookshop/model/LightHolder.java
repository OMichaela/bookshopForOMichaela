package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


    @Entity
    public class LightHolder {

        @Id
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "material")
        private String material;

        @Column(name = "color")
        private String color;

        @Column(name = "shape")
        private String shape;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;


        public LightHolder(Long id, String name, String material, String color, String shape, double price) {
            this.id = id;
            this.name = name;
            this.material = material;
            this.color = color;
            this.shape = shape;
            this.price = price;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        @Override
        public String toString() {
            return "this is a light holder object with type: " + type;
        }
}
