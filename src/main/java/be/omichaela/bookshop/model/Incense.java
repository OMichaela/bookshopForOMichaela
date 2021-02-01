package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Incense {

    @Id
    private Long id;
    @Column(name = "INCENSETYPE")
    private String type;

    public Incense() {
    }

    public Incense(String type) {
        this.type = type;
    }

    public Incense(Long id, String type) {
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
        return "this is an incense object with type: " + type;
    }
}
