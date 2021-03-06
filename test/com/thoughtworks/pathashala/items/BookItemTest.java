package com.thoughtworks.pathashala.items;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookItemTest {
    @Test
    public void shouldCalculateCorrectSalesTax() throws Exception {
        BookItem bookItem = new BookItem(false, 12.49);
        double actualTax = bookItem.calculateBasicSalesTax();
        double expectedTax = 0.0d;

        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void shouldCalculateCorrectImportTax() throws Exception {
        BookItem bookItem = new BookItem(false, 12.49);
        double actualTax = bookItem.calculateImportDuty();
        double expectedTax = 0.62d;

        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void shouldBeRepresentedAsStringProperly() throws Exception {
        BookItem bookItem = new BookItem(false, 10);
        bookItem.setDescription("imported book");
        bookItem.setQuantity(1);

        String actualString = bookItem.toString();
        String expectedString = "1 imported book at 10.00";

        assertEquals(expectedString, actualString);
    }
}