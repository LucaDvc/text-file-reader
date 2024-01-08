package org.example.readers.impl;

import org.example.readers.TextFileReader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader implements TextFileReader {
    @Override
    public String readToString(String path) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("");
        while (scanner.hasNext()) {
            contentBuilder.append(scanner.next());
        }
        scanner.close();

        return contentBuilder.toString();
    }
}
