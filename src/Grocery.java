import java.math.BigDecimal;

public class Grocery extends Product implements Promotion {


    public Grocery (String name, int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }

}
