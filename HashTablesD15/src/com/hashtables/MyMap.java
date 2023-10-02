package com.hashtables;


import java.util.LinkedList;

public class MyMap {
    LinkedList<MyMapNode>[] linkedLists;

    public MyMap(int size) {
        linkedLists = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            linkedLists[i] = new LinkedList<>();
        }
    }

    public void put(String key, int value) {
        int index = key.hashCode() % linkedLists.length;
        LinkedList<MyMapNode> linkedList = linkedLists[index];

        MyMapNode node = new MyMapNode(key, value);
        linkedList.add(node);
    }

    public int get(String key) {
        int index = key.hashCode() % linkedLists.length;
        LinkedList<MyMapNode> linkedList = linkedLists[index];

        for (MyMapNode node : linkedList) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return -1;
    }

    public boolean containsKey(String key) {
        return get(key) != -1;
    }
}


