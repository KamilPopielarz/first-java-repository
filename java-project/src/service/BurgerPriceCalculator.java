package service;

import service.interfaces.PriceCalculator;

public class BurgerPriceCalculator implements PriceCalculator {

    private double priceForCmOfHeight;
    private double pricePerKilometer;
    private double tipPercentage;


    public BurgerPriceCalculator(double priceForCmOfHeightFromConstructor, double pricePerKilometerFromConstructor, double tipPercentageFromConstructor){
        this.priceForCmOfHeight = priceForCmOfHeightFromConstructor;
        this.pricePerKilometer = pricePerKilometerFromConstructor;
        this.tipPercentage = tipPercentageFromConstructor;
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

    private double calculateTip(double burgerAndDelivery) {
        return burgerAndDelivery * tipPercentage;
    }
}
