package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class BellSet {

        @Id
        private Long id;
        @Column(name = "BELLSETTYPE")
        private String type;

        public BellSet() {
        }

        public BellSet(String type) {
            this.type = type;
        }

        public BellSet(Long id, String type) {
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
            return "this is a bellSet object with type: " + type;
        }
}
