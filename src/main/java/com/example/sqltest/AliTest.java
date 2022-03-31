package com.example.sqltest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AliTest {
    File file = new File("");
    OutputStream outputStream = new OutputStream() {
        @Override
        public void write(int b) throws IOException {

        }
    };
    InputStream inputStream = new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }
    };

}
