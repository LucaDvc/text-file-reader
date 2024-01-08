package org.example;

import org.example.counters.StringCounter;
import org.example.readers.TextFileReader;

import java.io.IOException;

public class TextReaderApplication {
    public static void run(TextFileReader reader, StringCounter counter) {
        try {
            String text = reader.readToString("src/main/resources/fileTest.txt");
            int counts = counter.count(text);

            System.out.printf("File content: %s;\nNumber of words: %o%n", text, counts);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
