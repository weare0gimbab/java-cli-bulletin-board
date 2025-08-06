package com.ll;

import com.ll.standard.util.TestUtil;

import java.io.ByteArrayOutputStream;

public class AppTestRunner {
    public static String run(String input) {
        App.scanner = TestUtil.genScanner(input + "\nexit");

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        new App();
        App.run();

        TestUtil.clearSetOutToByteArray();
        return output.toString();
    }
}