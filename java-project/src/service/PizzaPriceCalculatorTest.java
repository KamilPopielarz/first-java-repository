package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaPriceCalculatorTest {

    @Test
    public void testPizzaPriceCalculator() {
        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.06, 3, 10);
        double price = pizzaPriceCalculator.calculatePrice(32);
        Assertions.assertEquals(48.2304, price);

    }

    @Test
    public void testPizzaPriceCalculatorNegativeArea() {
        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.06, 3, 10);
        Assertions.assertThrows(IllegalArgumentException.class, () -> pizzaPriceCalculator.calculatePrice(-32));

    }
    @Test
    public void testCalculateDeliveryPrice(){
        PizzaPriceCalculator pizzaPriceCalculator = new PizzaPriceCalculator(0.06,3,10);
        Assertions.assertThrows(IllegalArgumentException.class,()->pizzaPriceCalculator.calculateDeliveryPrice(-10));
    }
}