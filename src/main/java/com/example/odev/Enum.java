package com.example.odev;

public enum Enum {
    BTC("BTC"),
    ETH("ETH"),
    SHIB("SHIB");

    private final String text;

    Enum(final String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }


}
