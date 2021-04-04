package main.dp;

import java.util.HashMap;
import java.util.Map;

public class CountConstructMemo {

    public static Integer run(String word, String[] wordBank) {
        Map<String, Integer> mapping = new HashMap<>();
        return runner(word, wordBank, mapping);
    }

    private static Integer runner(String word, String[] wordBank, Map<String, Integer> mapping) {
        
        Integer cachedValue = mapping.get(word);
        if (cachedValue != null)
            return cachedValue;

        if (word.equals(""))
            return 1;

        Integer ways = 0;

        for (String w : wordBank) {
            if (word.startsWith(w)) {
                String newWord = word.substring(w.length());
                Integer res = runner(newWord, wordBank, mapping);
                if (res != null) {
                    ways += res;
                }
            }
        }

        mapping.put(word, ways);
        return ways;
    }

}
