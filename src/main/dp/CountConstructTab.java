package main.dp;

public class CountConstructTab {

    public static Integer run(String word, String[] wordBank) {

        int[] table = new int[word.length() + 1];
        table[0] = 1;

        for (int ix = 0; ix < word.length(); ix++) {
            if (table[ix] == 0)
                continue;

            String substring = word.substring(ix, word.length());
            for (String w : wordBank) {
                if (substring.startsWith(w) && ix + w.length() < table.length){
                    table[ix + w.length()] += table[ix];
                }
            }
        }
        
        return table[table.length - 1];
    }

}
