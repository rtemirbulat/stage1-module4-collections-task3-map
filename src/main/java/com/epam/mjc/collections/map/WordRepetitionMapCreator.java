package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> newMap = new HashMap<>();
        if(!sentence.isEmpty()) {
            sentence = sentence.toLowerCase().replaceAll("[,.]", "");
            String[] words = sentence.trim().split(" ");
            for (String word : words) {
                if (newMap.containsKey(word)) {
                    newMap.put(word, newMap.get(word) + 1);
                } else {
                    newMap.putIfAbsent(word, 1);
                }
            }
        }
        return newMap;

    }
}
