package main.dp;

import java.util.HashMap;
import java.util.Map;

public class AllConstructMemo {

    public static String[][] run(String word, String[] wordBank) {
        Map<String, String[][]> mapping = new HashMap<>();
        return runner(word, wordBank, mapping);
    }

    private static String[] append(String[] arr, String val) {
        String[] newArr = new String[arr.length + 1];
        for (int ix = 0; ix < arr.length; ix++) {
            newArr[ix] = arr[ix];
        }
        newArr[newArr.length - 1] = val;
        return newArr;
    }

    private static String[][] appendToEveryRow(String[][] arr, String val) {
        String[][] newArr = new String[arr.length][];
        for (int ix = 0; ix < arr.length; ix++) {
            newArr[ix] = append(arr[ix], val);
        }
        return newArr;
    }

    private static String[][] merge(String[][] left, String[][] right) {

        String[][] newArr = new String[left.length + right.length][];
        int counter = 0;

        for (String[] v : left)
            newArr[counter++] = v;

        for (String[] v : right)
            newArr[counter++] = v;

        return newArr;
    }

    private static String[][] runner(String word, String[] wordBank, Map<String, String[][]> mapping) {
        
        String[][] cachedValue = mapping.get(word);
        if (cachedValue != null)
            return cachedValue;

        if (word.equals(""))
            return new String[][]{{}};

        String[][] ways = new String[][]{};

        for (String w : wordBank) {
            if (word.startsWith(w)) {
                String newWord = word.substring(w.length());
                String[][] res = runner(newWord, wordBank, mapping);
                if (res != null) {
                    res = appendToEveryRow(res, w);
                    ways = merge(ways, res);
                }
            }
        }

        mapping.put(word, ways);
        return ways;
    }

}
