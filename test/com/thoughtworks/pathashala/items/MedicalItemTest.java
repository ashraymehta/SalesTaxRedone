package com.thoughtworks.pathashala.items;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MedicalItemTest {
    @Test
    public void shouldCalculateCorrectSalesTax() throws Exception {
        MedicalItem medicalItem = new MedicalItem(false, 12.49);
        double actualTax = medicalItem.calculateBasicSalesTax();
        double expectedTax = 0.0d;

        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void shouldCalculateCorrectImportTax() throws Exception {
        MedicalItem medicalItem = new MedicalItem(false, 12.49);
        double actualTax = medicalItem.calculateImportDuty();
        double expectedTax = 0.62d;

        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void shouldBeRepresentedAsStringProperly() throws Exception {
        MedicalItem medicalItem = new MedicalItem(false, 10);
        medicalItem.setDescription("imported pills");
        medicalItem.setQuantity(1);

        String actualString = medicalItem.toString();
        String expectedString = "1 imported pills at 10.00";

        assertEquals(expectedString, actualString);
    }
}