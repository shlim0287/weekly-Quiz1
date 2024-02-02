import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    private final double weight;
    private final BigDecimal price;

    private final String name;

    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
        this.name=name;
        this.weight=weight;
        this.price=price;
    }

    @Override
    public BigDecimal getDeliveryCharge() {
        BigDecimal weightCharge = calculateWeightCharge(weight);
        return calculateTotalCharge(price, weightCharge);
    }


    private BigDecimal calculateWeightCharge(double weight) {
        BigDecimal weightCharge;
        if (weight < 3) {
            weightCharge = ConstantsProvider.SMALL_WEIGHT_CHARGE;
        } else if (weight < 10) {
            weightCharge = ConstantsProvider.MEDIUM_WEIGHT_CHARGE;
        } else {
            weightCharge = ConstantsProvider.LARGE_WEIGHT_CHARGE;
        }
        return weightCharge;
    }

    private BigDecimal calculateTotalCharge(BigDecimal price, BigDecimal weightCharge) {
        BigDecimal totalCharge;
        if (price.compareTo(ConstantsProvider.DISCOUNT_THRESHOLD) < 0) {
            totalCharge = weightCharge;
        } else if (price.compareTo(ConstantsProvider.FREE_DELIVERY_THRESHOLD) < 0) {
            totalCharge = applySubtract(weightCharge);
        } else {
            totalCharge = BigDecimal.ZERO;
        }
        return totalCharge;
    }

    private BigDecimal applySubtract(BigDecimal weightCharge) {
        return weightCharge.subtract(ConstantsProvider.DISCOUNT_AMOUNT);
    }

    @Override
    public String toString() {
        BigDecimal deliveryCharge = getDeliveryCharge();
        return  name+ "의 배송료는 " + deliveryCharge + "원 입니다.";
    }
}
