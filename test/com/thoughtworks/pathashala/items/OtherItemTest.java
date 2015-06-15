package com.thoughtworks.pathashala.items;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OtherItemTest {
    @Test
    public void shouldCalculateCorrectSalesTax() throws Exception {
        OtherItem otherItem = new OtherItem(false, 14.99);
        double actualTax = otherItem.calculateBasicSalesTax();
        double expectedTax = 1.50d;

        assertEquals(expectedTax, actualTax);
    }
}