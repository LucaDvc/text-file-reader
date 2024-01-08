package org.example.readers.impl;

import org.example.readers.TextFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader implements TextFileReader {
    @Override
    public String readToString(String path) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader(path));
        int character;
        while ((character = reader.read()) != -1) {
            contentBuilder.append((char) character);
        }
        reader.close();

        return contentBuilder.toString();
    }
}
