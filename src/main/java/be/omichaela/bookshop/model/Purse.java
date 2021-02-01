package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purse {

        @Id
        private Long id;
        @Column(name = "PURSETYPE")
        private String type;

        public Purse() {
        }

        public Purse(String type) {
            this.type = type;
        }

        public Purse(Long id, String type) {
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
            return "this is a purse object with type: " + type;
        }
}
