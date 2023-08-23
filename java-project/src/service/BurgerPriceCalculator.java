package service;

import service.interfaces.PriceCalculator;

public class BurgerPriceCalculator extends AbstractPriceCalculator implements PriceCalculator  {

    private double priceForCmOfHeight;
    private double pricePerKilometer;

    public BurgerPriceCalculator(double priceForCmOfHeightFromConstructor, double pricePerKilometerFromConstructor, double tipPercentageFromConstructor){
        super(tipPercentageFromConstructor);
        this.priceForCmOfHeight = priceForCmOfHeightFromConstructor;
        this.pricePerKilometer = pricePerKilometerFromConstructor;
    }

    @Override
    public double calculatePrice(int size) {
        return size * priceForCmOfHeight;
    }

    @Override
    public double calculateDeliveryPrice(int distance) {
        return distance * pricePerKilometer;
    }

    @Override
    public double calculateTotalPrice(int size, int distance) {
        double burgerAndDelivery = calculatePrice(size) + calculateDeliveryPrice(distance);
        return burgerAndDelivery + calculateTip(burgerAndDelivery);
    }
}
