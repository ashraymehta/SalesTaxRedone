package com.thoughtworks.pathashala;

import com.thoughtworks.pathashala.items.Item;

import java.util.ArrayList;

public class SalesTaxApp {
    private Console console;
    private Parser parser;

    public SalesTaxApp(Console console, Parser parser) {
        this.console = console;
        this.parser = parser;
    }


    public void start() {
        String input = console.getUserInput();
        String[] lines = getLines(input);
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            Item item = parser.parse(lines[i]);
            items.add(item);
        }
    }

    private String[] getLines(String input) {
        return input.split(System.lineSeparator());
    }
}
