package service;

public class PizzaPriceCalculator {
    private double priceForCm2;
    private double pricePerKilometer;
    private double tipPercentage;

    public PizzaPriceCalculator(double priceForCm2FromConstructor, double pricePerKilometerFromConstructor, double tipPercentageFromConstructor) {
        this.priceForCm2 = priceForCm2FromConstructor;
        this.pricePerKilometer = pricePerKilometerFromConstructor;
        this.tipPercentage = tipPercentageFromConstructor;
    }

    public double calculatePrice(int diameter) {
        double radius = diameter / 2.0;
        double pizzaArea = 3.14 * (radius) * (radius);
        return pizzaArea * priceForCm2;
    }

    public double calculateDeliveryPrice(int distance) {
        return distance * pricePerKilometer;
    }

    public double calculateTotalPrice(int diameter, int distance) {
        double pizzaAndDelivery = calculatePrice(diameter) + calculateDeliveryPrice(distance);
        return pizzaAndDelivery + calculateTip(pizzaAndDelivery);
    }

    public double calculateTip(double pizzaAndDelivery) {
        return pizzaAndDelivery * tipPercentage;
    }

}
