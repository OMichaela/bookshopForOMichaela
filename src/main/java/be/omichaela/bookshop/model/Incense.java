package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Incense {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "perfume")
    private String perfume;

    @Column(name = "reducedSmoke")
    private boolean reducedSmoke;

    @NotEmpty(message = "Price is mandatory")
    @Column(name = "price")
    private double price;


    public Incense(long id, String name, String perfume, boolean reducedSmoke, double price) {
        this.id = id;
        this.name = name;
        this.perfume = perfume;
        this.reducedSmoke= reducedSmoke;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPerfume() {
        return perfume;
    }

    public void setPerfume(String perfume) {
        this.perfume = perfume;
    }

    public double getReducedSmoke() {
        return IsReducedSmoke;
    }

    public void setReducedSmoke(boolean reducedSmoke) {
        this.reducedSmoke = reducedSmoke;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "this is an incense object with type: " + type;
    }
}
