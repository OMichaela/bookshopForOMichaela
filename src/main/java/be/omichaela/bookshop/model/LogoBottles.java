package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity
    public class LogoBottles {

        @Id
        private Long id;
        @Column(name = "LOGOBOTTLESTYPE")
        private String type;

        public LogoBottles() {
        }

        public LogoBottles(String type) {
            this.type = type;
        }

        public LogoBottles(Long id, String type) {
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
            return "this is a logo bottles object with type: " + type;
        }
}
