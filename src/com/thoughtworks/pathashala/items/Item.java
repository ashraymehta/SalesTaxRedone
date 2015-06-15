package com.thoughtworks.pathashala.items;

public interface Item {
    boolean isImported();
    double calculateBasicSalesTax();
    double calculateImportDuty();
}
