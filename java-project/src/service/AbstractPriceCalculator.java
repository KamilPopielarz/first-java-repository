package service;

public abstract class AbstractPriceCalculator {
    private double tipPercentage;
    public AbstractPriceCalculator(double tipPercentageFromConstructor){
        this.tipPercentage = tipPercentageFromConstructor;
    }

    protected double calculateTip(double burgerAndDelivery) {
        return burgerAndDelivery * tipPercentage;
    }
}
