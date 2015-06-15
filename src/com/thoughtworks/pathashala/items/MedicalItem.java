package com.thoughtworks.pathashala.items;

public class MedicalItem implements Item {
    private boolean isImported;
    private double price;
    private String description;

    public MedicalItem(boolean isImported, double price) {
        this.isImported = isImported;
        this.price = price;
    }

    public MedicalItem() {

    }

    @Override
    public boolean isImported() {
        return false;
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

    private double roundOff(Double rough) {
        return (double) Math.round(rough * 100) / 100;
    }

    @Override
    public double calculateImportDuty() {
        return roundOff(0.05d * price);
    }
}
