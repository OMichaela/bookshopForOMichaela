package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class WaterCup {

        @Id
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "material")
        private Material material;

        @Column(name = "color")
        private Color color;

        @NotBlank(message = "Price is mandatory")
        @Column(name = "price")
        private double price;


        public WaterCup(Long id, String name, Material material, Color color, double price) {
            super();
            this.id = id;
            this.name = name;
            this.material = material;
            this.color = color;
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

        public double getPrice() {
        return price;
    }

        public void setPrice(double price) {
        this.price = price;
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

        @Override
        public String toString() {
            return "this is a watercup object with type: " + type;
        }
}
