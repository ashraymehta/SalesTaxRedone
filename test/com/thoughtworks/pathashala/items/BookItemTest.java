package com.thoughtworks.pathashala.items;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookItemTest {
    @Test
    public void shouldCalculateCorrectSalesTax() throws Exception {
        BookItem bookItem = new BookItem(false, 12.49);
        double actualTax = bookItem.calculateSalesTax();
        double expectedTax = 0.0d;

        assertEquals(expectedTax, actualTax);
    }
}