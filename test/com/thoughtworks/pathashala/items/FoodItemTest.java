package com.thoughtworks.pathashala.items;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FoodItemTest {
    @Test
    public void shouldCalculateCorrectSalesTax() throws Exception {
        FoodItem foodItem = new FoodItem(false, 12.49);
        double actualTax = foodItem.calculateBasicSalesTax();
        double expectedTax = 0.0d;

        assertEquals(expectedTax, actualTax);
    }
}