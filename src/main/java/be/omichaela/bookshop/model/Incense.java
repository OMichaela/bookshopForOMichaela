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
    private Perfume perfume;

    @Column(name = "reducedSmoke")
    private boolean isReducedSmoke;

    @NotEmpty(message = "Price is mandatory")
    @Column(name = "price")
    private double price;


    public Incense(long id, String name, Perfume perfume, boolean isReducedSmoke, double price) {
        this.id = id;
        this.name = name;
        this.perfume = perfume;
        this.isReducedSmoke= isReducedSmoke;
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

    public Perfume getPerfume() {
        return perfume;
    }

    public void setPerfume(Perfume perfume) {
        this.perfume = perfume;
    }

    public double getisReducedSmoke() {
        return isReducedSmoke;
    }

    public void setisReducedSmoke(boolean isReducedSmoke) {
        this.isReducedSmoke = isReducedSmoke;
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
