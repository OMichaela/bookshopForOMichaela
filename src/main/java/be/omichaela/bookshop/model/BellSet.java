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
        private Material material;

        @Column(name = "size")
        private Size size;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;



        public BellSet(Long id, Material material, Size size, double price) {
            this.id = id;
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
            return "this is a bellSet object with type: " + type;
        }
}
