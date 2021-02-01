package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity
    public class Newspaper {

        @Id
        private Long id;
        @Column(name = "NEWSPAPERTITLE")
        private String title;

        public Newspaper() {
        }

        public Newspaper(String title) {
            this.title = title;
        }

        public Newspaper(Long id, String title) {
            this.id = id;
            this.title = title;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "this is a newspaper object with title: " + title;
        }
}
