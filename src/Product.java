import java.math.BigDecimal;

public class Product {
    private String name;

    private BigDecimal price;

    private double weight;

    Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

}
