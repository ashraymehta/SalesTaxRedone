package com.thoughtworks.pathashala.items;

public class OtherItem implements Item {
    private boolean isImported;
    private double price;

    public OtherItem() {

    }

    public OtherItem(boolean isImported, double price) {
        this.isImported = isImported;
        this.price = price;
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
        return roundOff(0.1d * price);
    }

    private double roundOff(Double rough) {
        return (double) Math.round(rough * 100) / 100;
    }

    @Override
    public double calculateImportDuty() {
        return roundOff(0.05d * price);
    }
}
