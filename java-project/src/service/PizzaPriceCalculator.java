package service;

import service.interfaces.PriceCalculator;

public class PizzaPriceCalculator extends AbstractPriceCalculator  implements PriceCalculator {
    private double priceForCm2;
    private double pricePerKilometer;

    public PizzaPriceCalculator(double priceForCm2FromConstructor, double pricePerKilometerFromConstructor, double tipPercentageFromConstructor) {
        super (tipPercentageFromConstructor);
        this.priceForCm2 = priceForCm2FromConstructor;
        this.pricePerKilometer = pricePerKilometerFromConstructor;
    }

    public double calculatePrice(int size) {
        double radius = size / 2.0;
        double pizzaArea = 3.14 * (radius) * (radius);
        return pizzaArea * priceForCm2;
    }

    public double calculateDeliveryPrice(int distance) {
        return distance * pricePerKilometer;
    }

    public double calculateTotalPrice(int size, int distance) {
        double pizzaAndDelivery = calculatePrice(size) + calculateDeliveryPrice(distance);
        return pizzaAndDelivery + calculateTip(pizzaAndDelivery);
    }
}
