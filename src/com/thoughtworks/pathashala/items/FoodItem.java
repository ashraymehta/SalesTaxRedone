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

    private double roundOff(Double rough) {
        return (double) Math.round(rough * 100) / 100;
    }

    @Override
    public double calculateImportDuty() {
        return roundOff(.05d * price);
    }
}
