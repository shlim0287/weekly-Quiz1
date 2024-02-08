package weekly1;

public class Beauty extends Product implements Promotion {

    public Beauty(String name, int price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
