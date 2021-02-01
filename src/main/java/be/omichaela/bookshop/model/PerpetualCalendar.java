package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PerpetualCalendar {

        @Id
        private Long id;
        @Column(name = "CALENDARTYPE")
        private String type;

        public PerpetualCalendar() {
        }

        public PerpetualCalendar(String type) {
            this.type = type;
        }

        public PerpetualCalendar(Long id, String type) {
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
            return "this is a perpetual calendar object with type: " + type;
        }}
