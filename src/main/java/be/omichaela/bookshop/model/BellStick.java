package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


    @Entity
    public class BellStick {

        @Id
        private Long id;
        @Column(name = "material")
        private String material;

        @Column(size = "size")
        private String size;

        @Column(color = "color")
        private String color;

        @NotBlank(message = "Price is mandatory")
        @Column(price = "price")
        private String price;

        public BellStick() {
        }

        public BellStick(String material) {
            this.material = material;
        }

        public BellStick(Long id, String type) {
            this.id = id;
            this.material = material;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }


        @Override
        public String toString() {
            return "this is an incense object with type: " + type;
        }
}
