package com.thoughtworks.pathashala;

public class SalesTaxApp {
    private Console console;

    public SalesTaxApp(Console console) {
        this.console = console;
    }


    public void start() {
        console.getUserInput();
    }
}
