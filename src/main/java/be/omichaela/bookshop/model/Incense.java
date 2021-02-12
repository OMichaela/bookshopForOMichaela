package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Incense {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(perfume = "perfume")
    private String perfume;

    @Column(reducedSmoke = "reducedSmoke")
    private String reducedSmoke;

    @NotBlank(message = "Price is mandatory")
    @Column(price = "price")
    private String price;

    public Incense() {
    }

    public Incense(String perfume) {
        this.perfume = perfume;
    }

    public Incense(Long id, String perfume) {
        this.id = id;
        this.perfume = perfume;
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
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "this is an incense object with type: " + type;
    }
}
