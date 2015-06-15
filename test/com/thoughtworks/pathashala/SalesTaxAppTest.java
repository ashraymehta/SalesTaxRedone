package com.thoughtworks.pathashala;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SalesTaxAppTest {
    @Mock
    Console console;

    private SalesTaxApp salesTaxApp;

    @Before
    public void setUp() throws Exception {
        salesTaxApp = new SalesTaxApp(console);

    }

    @Test
    public void shouldGetUserInput() throws Exception {
        salesTaxApp.start();
        verify(console).getUserInput();
    }
}