package com.thoughtworks.pathashala.items;

public interface Item {
    boolean isImported();
    void setImported(boolean isImported);
    void setPrice(double price);
    double calculateBasicSalesTax();
    double calculateImportDuty();
}
