package org.example.readers;

import java.io.IOException;

public interface TextFileReader {
    String readToString(String path) throws IOException;
}
