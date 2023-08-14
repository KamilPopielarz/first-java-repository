package service.interfaces;

public interface PriceCalculator {
    double calculatePrice(int diameter);

    double calculateDeliveryPrice(int distance);

    double calculateTotalPrice(int diameter, int distance);


}
