package com.thoughtworks.pathashala.items;

public interface Item {
    boolean isImported();
    double calculateSalesTax();
    double calculateImportDuty();
}
