package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Beads {

    @Id
    private Long id;

    @Column(name = "material")
    private Material material;

    @Column(name = "size")
    private Size size;

    @Column(name = "color")
    private Color color;

    @NotBlank(message = "Price is mandatory")
    @Column(name = "price")
    private double price;


    public Beads(Long id, Material material, Size size, Color color, double price) {
        this.id = id;
        this.material = material;

        this.size = size;
        this.color = color;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    class PrintSize {
        Sizes coffeeSize;

        public PrintSize(Sizes coffeeSize) {
            this.coffeeSize = coffeeSize;
        }

        public void placeOrder() {
            switch(coffeeSize) {
                case SMALL:
                    System.out.println("This coffee should be small.");
                    break;
                case REGULAR:
                    System.out.println("This coffee should be REGULAR.");
                    break;
                case LARGE:
                    System.out.println("This coffee should be large.");
                    break;
            }
        }
    }


    @Override
    public String toString() {
        return "this is a beads object with this style: " + style;
    }}
