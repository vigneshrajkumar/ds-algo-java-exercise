package main.dp;

import java.util.HashMap;
import java.util.Map;

public class CanConstructMemo {

    public static boolean run(String word, String[] wordBank){
        Map<String, Boolean> mapping = new HashMap<>();

        return runner(word, wordBank, mapping);
    }

    private static Boolean runner(String word, String[] wordBank, Map<String, Boolean> mapping) {
        Boolean cachedValue = mapping.get(word);
        if (cachedValue != null)
            return cachedValue;
        
        if (word.equals(""))
            return true;

        for(String w : wordBank){
            if (word.startsWith(w)){
                String newWord = word.substring(w.length());
                if (runner(newWord, wordBank, mapping)){
                    mapping.put(word, true);
                    return true;
                }
            }
        }
        mapping.put(word, false);
        return false;
    }
    
}
