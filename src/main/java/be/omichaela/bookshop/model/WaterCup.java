package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class WaterCup {

        @Id
        private Long id;
        @Column(name = "WATERCUPTYPE")
        private String type;

        @NotBlank(message = "Price is mandatory")
        @Column(price = "price")


        private String price;


        public WaterCup() {
        }

        public WaterCup(String type) {
            this.type = type;
        }

        public WaterCup(Long id, String type) {
            this.id = id;
            this.type = type;
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

        @Override
        public String toString() {
            return "this is a watercup object with type: " + type;
        }
}
