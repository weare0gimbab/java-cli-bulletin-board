package com.ll.global.rq;

import lombok.Getter;

public class Rq {
    @Getter
    private final String actionName;
    private final String params;

    public Rq(String cmd) {
        String[] cmdBits = cmd.split(" ", 2);
        actionName = cmdBits[0].trim();

        params = cmdBits.length == 2  ? cmdBits[1].trim() : "";
    }

    public int getParamsAsInt(String name, int defaultValue) {
        String value = getParam(name, "");

        if (value == null) return defaultValue;
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public String getParam(String name, String defaultValue) {
        return params;
    }
}
