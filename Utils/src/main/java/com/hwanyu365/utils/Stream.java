package com.hwanyu365.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {
    public static void close(InputStream input) {
        if (input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(OutputStream output) {
        if (output != null) {
            try {
                output.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
