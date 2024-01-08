package org.example;

import org.example.counters.StringCounter;
import org.example.counters.WordCounter;
import org.example.readers.TextFileReader;
import org.example.readers.impl.BuffReader;
import org.example.readers.impl.ScannerReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextFileReader reader = new ScannerReader();
        StringCounter counter = new WordCounter();

        TextReaderApplication.run(reader, counter);
    }
}