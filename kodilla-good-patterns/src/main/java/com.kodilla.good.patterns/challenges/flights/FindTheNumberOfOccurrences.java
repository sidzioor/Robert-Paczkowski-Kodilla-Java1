package com.kodilla.good.patterns.challenges.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheNumberOfOccurrences {
    public static String findNumberOfOccurrences(List<String> locations) {
        HashMap<String, Integer> occurrences= new HashMap<>();
        for (String location : locations) {
            if (!occurrences.containsKey(location)) {
                occurrences.put(location, 1);
            } else {
                Integer count = occurrences.get(location);
                occurrences.put(location, count + 1);
            }
        }
        List<String> results = occurrences.entrySet().stream()
                .filter(o->o.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return results+" ";
    }
}
