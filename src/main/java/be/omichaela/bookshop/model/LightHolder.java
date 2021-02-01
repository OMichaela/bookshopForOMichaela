package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity
    public class LightHolder {

        @Id
        private Long id;
        @Column(name = "LIGHTHOLDERTYPE")
        private String type;

        public LightHolder() {
        }

        public LightHolder(String type) {
            this.type = type;
        }

        public LightHolder(Long id, String type) {
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
            return "this is a light holder object with type: " + type;
        }
}
