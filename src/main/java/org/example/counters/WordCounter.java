package org.example.counters;

public class WordCounter implements StringCounter {
    @Override
    public int count(String text) {
        return text.split("\\s+").length;
    }
}
