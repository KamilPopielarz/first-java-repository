package service;

import service.interfaces.PriceCalculator;

public class SpaghettiPriceCalculator extends AbstractPriceCalculator implements PriceCalculator {


    public SpaghettiPriceCalculator(double tipPercentageFromConstructor) {
        super(tipPercentageFromConstructor);
    }

    @Override
    public double calculatePrice(int size) {
        return 0;
    }

    @Override
    public double calculateDeliveryPrice(int distance) {
        return 0;
    }

    @Override
    public double calculateTotalPrice(int size, int distance) {
        return 0;
    }
}
