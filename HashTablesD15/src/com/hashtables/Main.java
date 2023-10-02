package com.hashtables;


public class Main {
    public static void main(String[] args) {
        String phrase = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        // Create a MyMap with 100 slots.
        MyMap myMap = new MyMap(100);

        // Add the word "avoidable" to the MyMap with the value `true`.
        myMap.put("avoidable", true);

        // Split the phrase into words.
        String[] words = phrase.split(" ");

        // Create a new phrase to store the words that are not avoidable.
        StringBuilder newPhrase = new StringBuilder();

        // For each word in the original phrase, check if it is avoidable in the MyMap.
        // If the word is not avoidable, add it to the new phrase.
        for (String word : words) {
            if (!myMap.containsKey(word)) {
                newPhrase.append(word).append(" ");
            }
        }

        // Print the new phrase.
        System.out.println(newPhrase.toString());
    }
}