package main.dp;

public class CanConstructTab {
    public static boolean run(String word, String[] wordBank) {
        boolean[] table = new boolean[word.length() + 1];
        table[0] = true;

        for (int ix = 0; ix < word.length(); ix++) {
            if (!table[ix])
                continue;

            for (String w : wordBank) {
                String substring = word.substring(ix, word.length());
                if (substring.startsWith(w) && (ix + w.length()) < table.length) {
                    table[ix + w.length()] = true;
                }
            }
        }
        return table[table.length - 1];
    }
}
