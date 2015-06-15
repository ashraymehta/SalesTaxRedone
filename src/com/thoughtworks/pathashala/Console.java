package com.thoughtworks.pathashala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

// Handles all I/O
public class Console {
    private BufferedReader bufferedReader;
    private PrintStream printStream;

    public Console(BufferedReader bufferedReader, PrintStream printStream) {
        this.bufferedReader = bufferedReader;
        this.printStream = printStream;
    }

    public String getUserInput() {
        String line = "";
        StringBuilder stringBuilder = new StringBuilder();
        do {
            line = getNextLine();
            if(line == null || line.equals(""))
                break;
            stringBuilder.append(line).append(System.lineSeparator());
        } while(true);
        return stringBuilder.toString();
    }

    private String getNextLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return "";
        }
    }
}
