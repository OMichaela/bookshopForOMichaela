package be.omichaela.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Beads {

    @Id
    private Long id;

    @NotBlank(message = "Material is mandatory")
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


    //Beads are made or in plastic or in wood -
    // This field must be filled -
    // another opened option must be added//
     if(material == Material.PLASTIC)
            System.out.println("Beads are in plastic");
        else if(material == Material.WOOD)
            System.out.println("Beads are in wood");
        else
                System.out.println("Please select bead's material");
}
    //Choose Beads color
// {
        switch(color) {
            case AQUA:
                System.out.println("Beads are aqua");
                break;
            case BLUE:
                System.out.println("Beads are blue");
                break;
            case BROWN:
                System.out.println("Beads are brown");
                break;
            case DARK_BLUE:
                System.out.println("Beads are dark blue");
                break;
            case FUCHSIA:
                System.out.println("Beads are fuchsia");
                break;
            case GREY:
                System.out.println("Beads are grey");
                break;
            case IVORY:
                System.out.println("Beads are ivory");
                break;
            case JADE:
                System.out.println("Beads are jade");
                break;
            case MAGENTA:
                System.out.println("Beads are magenta");
                break;
            case MALACHITE:
                System.out.println("Beads are malachite");
                break;
            case  PINK:
                System.out.println("Beads are pink");
                break;
            case  PLUM:
                System.out.println("Beads are plum");
                break;
            case  PURPLE:
                System.out.println("Beads are purple");
                break;
            case  RED:
                System.out.println("Beads are red");
            case  WHITE:
                System.out.println("Beads are white");
                break;
            case  YELLOW:
                System.out.println("Beads are yellow");
                break;
        }
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
