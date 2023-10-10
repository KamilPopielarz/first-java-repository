import service.BurgerPriceCalculator;
import service.PizzaPriceCalculator;

public class Main {
    public static void main(String[] args) {
//        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.04, 3.51, 0.05);
//        System.out.println("Pizza costs: " + pizzaPriceCalculator.calculatePrice(30) + " zł");
//        System.out.println("Delivery costs: " + pizzaPriceCalculator.calculateDeliveryPrice(10) + "zł");
//        System.out.println("OverallPrice: " + pizzaPriceCalculator.calculateTotalPrice(30, 10) + "zł");

        BurgerPriceCalculator burgerPriceCalculator = new BurgerPriceCalculator(3, 3, 0.05);
        System.out.println("Burger costs: " + burgerPriceCalculator.calculatePrice(10) + "zł");
        System.out.println("Delivery costs: " + burgerPriceCalculator.calculateDeliveryPrice(13) + "zł");
        System.out.println("Overall costs: " + burgerPriceCalculator.calculateTotalPrice(10, 13) + "zł");
    }
}