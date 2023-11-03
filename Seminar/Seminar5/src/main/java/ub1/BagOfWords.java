package ub1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class BagOfWords {
    LinkedHashSet<String> wordMap = new LinkedHashSet<>();

    public BagOfWords(List<String> sentences) {
        for (String sentence : sentences) {
            for (String word : sentence.split(" ")) {
                wordMap.add(word);
            }
        }
    }

    public List<Integer> transform(String sentence) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        List<Integer> freq = new ArrayList<>();
        for (String word : sentence.split(" "))
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        for (String key : wordMap.keySet()) {
            freq.add(frequencyMap.getOrDefault(key, 0));
        }

        return freq;
    }
}
