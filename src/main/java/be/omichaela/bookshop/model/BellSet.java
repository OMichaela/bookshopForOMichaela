package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class BellSet {

        @Id
        private Long id;

        @Column(name = "material")
        private String material;

        @Column(name = "size")
        private String size;

        @Column(name = "color")
        private String color;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;



        public BellSet(Long id, String material) {
            this.id = id;
            this.material = material;
            this.size = size;
            this.color = color;
            this.price = price;
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
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        @Override
        public String toString() {
            return "this is a bellSet object with type: " + type;
        }
}
