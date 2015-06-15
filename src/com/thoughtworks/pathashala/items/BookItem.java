package com.thoughtworks.pathashala.items;

public class BookItem implements Item {
    private boolean isImported;
    private double price;

    public BookItem() {

    }

    public BookItem(boolean isImported, double price) {
        this.isImported = isImported;
        this.price = price;
    }

    private double roundOff(Double rough) {
        return (double) Math.round(rough * 100) / 100;
    }

    @Override
    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean isImported) {
        this.isImported = isImported;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateBasicSalesTax() {
        return 0;
    }

    @Override
    public double calculateImportDuty() {
        return roundOff(0.05d * price);
    }
}
