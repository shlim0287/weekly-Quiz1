import java.math.BigDecimal;

public class FirstMain {
    public static void main(String[] args) {
        Beauty beauty=new Beauty("화장품",new BigDecimal("99999"), 15);
        Grocery grocery=new Grocery("식료품",new BigDecimal("10000"),4);
        LargeAppliance largeAppliance=new LargeAppliance("대형가전",new BigDecimal("3000000"),8);
        System.out.println(grocery.toString());
        System.out.println(beauty.toString());
        System.out.println(largeAppliance.toString());
    }
}
