package com.thoughtworks.pathashala.items;

import java.text.DecimalFormat;

public class BookItem implements Item {
    private boolean isImported;
    private double price;
    private String description;
    private int quantity;

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

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setImported(boolean isImported) {
        this.isImported = isImported;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double calculateBasicSalesTax() {
        return 0;
    }

    @Override
    public double calculateImportDuty() {
        return roundOff(0.05d * price);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return quantity + " " + description + " at " + df.format(price);
    }
}
