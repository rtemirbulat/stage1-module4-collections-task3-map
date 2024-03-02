package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer,String> e: sourceMap.entrySet()) {
            String value = e.getValue();
            Integer key = e.getKey();
            if(newMap.containsKey(value)){
                Integer existingKey = newMap.get(value);
                if(key < existingKey) newMap.put(value,key);
            }
            else newMap.put(value,key);
        }
        return newMap;
    }
}
