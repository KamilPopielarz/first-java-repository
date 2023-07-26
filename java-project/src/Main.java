import service.PizzaPriceCalculator;

public class Main {
    public static void main(String[] args) {
        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.04);
        System.out.println("Pizza costs: " + pizzaPriceCalculator.calculatePrice(30) + " zł");
    }
}