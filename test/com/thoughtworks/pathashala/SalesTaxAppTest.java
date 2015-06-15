package com.thoughtworks.pathashala;

import com.thoughtworks.pathashala.items.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.*;
import java.util.HashMap;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SalesTaxAppTest {
    Console console;
    @Mock
    Parser parser;

    private SalesTaxApp salesTaxApp;

    @Before
    public void setUp() throws Exception {
        HashMap<String, Item> stringItemHashMap = new HashMap<>();
        stringItemHashMap.put("book", new BookItem());
        stringItemHashMap.put("music", new OtherItem());
        stringItemHashMap.put("chocolate", new FoodItem());
        stringItemHashMap.put("perfume", new OtherItem());
        stringItemHashMap.put("pills", new MedicalItem());
        salesTaxApp = new SalesTaxApp(console, parser);
    }

    @Test
    public void shouldGetUserInput() throws Exception {
        salesTaxApp.start();
        when(console.getUserInput()).thenReturn("1 book at 10.00");
        verify(console).getUserInput();
    }

    @Test
    public void shouldGetItemFromParser() throws Exception {
        PrintStream printStream = new PrintStream(System.out);
        InputStreamReader in = new InputStreamReader(new ByteArrayInputStream("1 book at 10.00".getBytes()));
        console = new Console(new BufferedReader(in), printStream);
        salesTaxApp = new SalesTaxApp(console, parser);
        salesTaxApp.start();
        verify(parser).parse("1 book at 10.00");
    }
}