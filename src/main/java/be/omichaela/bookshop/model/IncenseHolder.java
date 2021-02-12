package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


    @Entity
    public class IncenseHolder {

        @Id
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(material = "material")
        private String material;

        @Column(color = "color")
        private String color;

        @Column(size = "size")
        private String size;

        @Column(shape = "shape")
        private String shape;

        @NotBlank(message = "Price is mandatory")
        @Column(price = "price")
        private String price;

        public IncenseHolder() {
        }

        public IncenseHolder(String name) {
            this.name = name;
        }

        public IncenseHolder(Long id, String name) {
            this.id = id;
            this.name = name;
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

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }


        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "this is a incense holder object with type: " + type;
        }
}
