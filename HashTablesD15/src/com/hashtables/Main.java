package com.hashtables;


    public class Main {
        public static void main(String[] args) {
            String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

            // Create a MyMap with 100 slots.
            MyMap myMap = new MyMap(100);

            // Split the paragraph into words.
            String[] words = paragraph.split(" ");

            // For each word, calculate the hashcode and use it to find the index in the MyMap LinkedList.
            for (String word : words) {
                int index = word.hashCode() % myMap.linkedLists.length;


            }
        }
    }