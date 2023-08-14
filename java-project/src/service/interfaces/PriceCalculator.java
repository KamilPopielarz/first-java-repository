package service.interfaces;

public interface PriceCalculator {
    double calculatePrice(int size);

    double calculateDeliveryPrice(int distance);

    double calculateTotalPrice(int size, int distance);


}
