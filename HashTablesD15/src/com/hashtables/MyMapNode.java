package com.hashtables;


public class MyMapNode {
    private String key;
    private boolean value;

    public MyMapNode(String key, boolean value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}