package com.hashtables;


    public class Main {
        public static void main(String[] args) {
            MyMap myMap = new MyMap();

            String sentence = "To be or not to be";
            String[] words = sentence.split(" ");

            for (String word : words) {
                int frequency = myMap.get(word);
                if (frequency == -1) {
                    myMap.put(word, 1);
                } else {
                    myMap.put(word, frequency + 1);
                }
            }

            for (MyMapNode node : myMap.linkedList) {
                System.out.println(node.getKey() + ": " + node.getValue());
            }
        }
    }
