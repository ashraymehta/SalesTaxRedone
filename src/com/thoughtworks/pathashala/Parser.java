package com.thoughtworks.pathashala;

import com.thoughtworks.pathashala.items.Item;

import java.util.HashMap;
import java.util.Iterator;

public class Parser {

    private HashMap<String, Item> stringItemHashMap;

    public Parser(HashMap<String, Item> stringItemHashMap) {
        this.stringItemHashMap = stringItemHashMap;
    }

    public Item parse(String input) {
        input = input.trim();
        Iterator<String> stringIterator = stringItemHashMap.keySet().iterator();
        String relevantKey = null;
        while(stringIterator.hasNext()) {
            String next = stringIterator.next();
            if(input.contains(next)) {
                relevantKey = next;
                break;
            }
        }

        Item item = stringItemHashMap.get(relevantKey);
        String[] split = input.split(" ");
        double price = Double.parseDouble(split[split.length - 1]);
        item.setPrice(price);
        item.setImported(input.contains("import"));

        return item;
    }
}
