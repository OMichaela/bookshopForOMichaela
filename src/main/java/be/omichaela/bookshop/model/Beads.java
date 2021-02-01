package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beads {

    @Id
    private Long id;
    @Column(name = "BEADSTYLE")
    private String style;

    public Beads() {
    }

    public Beads(String stylet) {
        this.style = style;
    }

    public Beads(Long id, String style) {
        this.id = id;
        this.style = style;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "this is a beads object with this style: " + style;
    }}
