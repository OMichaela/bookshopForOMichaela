package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


    @Entity
    public class LogoBottles {

        @Id
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "material")
        private Material material;

        @Column(name = "color")
        private Color color;

        @Column(name = "size")
        private Size size;

        @NotEmpty(message = "Price is mandatory")
        @Column(name = "price")
        private double price;



        public LogoBottles() {
        }

        public LogoBottles(Long id, String name, Material material, Color color, Size size, double price) {
            this.id = id;
            this.name = name;
            this.material = material;
            this.color = color;
            this.size = size;
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

        public Material getMaterial() {
            return material;
        }

        public void setMaterial(Material material) {
            this.material = material;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void setSize(String size) {
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
            return "this is a logo bottles object with type: " + type;
        }
}
