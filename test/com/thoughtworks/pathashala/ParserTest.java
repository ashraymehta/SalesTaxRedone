package com.thoughtworks.pathashala;

import com.thoughtworks.pathashala.items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class ParserTest {
    private HashMap<String, Item> stringItemHashMap;

    @Before
    public void setUp() throws Exception {
        stringItemHashMap = new HashMap<>();
        stringItemHashMap.put("book", new BookItem());
        stringItemHashMap.put("music", new OtherItem());
        stringItemHashMap.put("chocolate", new FoodItem());
        stringItemHashMap.put("perfume", new OtherItem());
        stringItemHashMap.put("pills", new MedicalItem());
    }

    @Test
    public void shouldGetInstanceOfBookWhenBookIsGivenAsInput() throws Exception {
        String input = "1 imported book at 12.49";
        Parser parser = new Parser(stringItemHashMap);
        Item item = parser.parse(input);

        assertTrue(item instanceof BookItem);
    }
}