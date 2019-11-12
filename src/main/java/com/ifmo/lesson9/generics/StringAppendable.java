package com.ifmo.lesson9.generics;

public class StringAppendable<string> implements Appendable<string> {
    private static String separator = ", ";


    public StringAppendable(String value) {
    }


    @Override
    public Appendable append(string o) {
        return null;
    }

    @Override
    public string value() {
        return null;
    }

    StringAppendable sa = new StringAppendable("gogogo");
}



