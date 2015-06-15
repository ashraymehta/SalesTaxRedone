package com.thoughtworks.pathashala.items;

public class FoodItem implements Item{
    private boolean isImported;
    private double price;

    public FoodItem(boolean isImported, double price) {
        this.isImported = isImported;
        this.price = price;
    }

    @Override
    public boolean isImported() {
        return isImported;
    }

    @Override
    public double calculateBasicSalesTax() {
        return 0;
    }

    @Override
    public double calculateImportDuty() {
        return 0;
    }
}
