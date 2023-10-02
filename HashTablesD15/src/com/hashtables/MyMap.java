package com.hashtables;


import java.util.LinkedList;

public class MyMap {
    private LinkedList<MyMapNode>[] linkedLists;

    public MyMap(int size) {
        linkedLists = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            linkedLists[i] = new LinkedList<>();
        }
    }

    public void put(String key, boolean value) {
        int index = key.hashCode() % linkedLists.length;
        LinkedList<MyMapNode> linkedList = linkedLists[index];

        MyMapNode node = new MyMapNode(key, value);
        linkedList.add(node);
    }

    public boolean get(String key) {
        int index = key.hashCode() % linkedLists.length;
        LinkedList<MyMapNode> linkedList = linkedLists[index];

        for (MyMapNode node : linkedList) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return false;
    }

    public boolean containsKey(String key) {
        return get(key);
    }
}
