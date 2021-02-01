package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity
    public class IncenseHolder {

        @Id
        private Long id;
        @Column(name = "PURSETYPE")
        private String type;

        public IncenseHolder() {
        }

        public IncenseHolder(String type) {
            this.type = type;
        }

        public IncenseHolder(Long id, String type) {
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
            return "this is a incense holder object with type: " + type;
        }
}
