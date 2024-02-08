package weekly1;

public class Product implements Promotion{
    private String name;

    private int price;

    private double weight;

    Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
