package service;

public class PizzaPriceCalculator {
    private double priceForCm2;

    public PizzaPriceCalculator(double priceForCm2FromConstructor) {
        this.priceForCm2 = priceForCm2FromConstructor;
    }

    public double calculatePrice(int diameter) {
        double radius = diameter / 2.0;
        double pizzaArea = 3.14 * (radius) * (radius);
        return pizzaArea * priceForCm2;
    }
}
