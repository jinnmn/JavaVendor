import java.time.LocalDate;

public class Product {

    private String name;
    private Double price;
    private LocalDate releaseDate;
     
    public Product(String name, Double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        
    }

    public String getName() {
        return name;        
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

}
