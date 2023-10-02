package com.hashtables;


import java.util.LinkedList;

public class MyMap {
        LinkedList<MyMapNode> linkedList;

        public MyMap() {
            linkedList = new LinkedList<>();
        }

        public void put(String key, int value) {
            MyMapNode node = new MyMapNode(key, value);
            linkedList.add(node);
        }

        public int get(String key) {
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

