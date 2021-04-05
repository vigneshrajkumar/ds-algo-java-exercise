package main.dp;

public class AllConstructTab {

    public static String[][] run(String word, String[] wordBank) {

        String[][][] table = new String[word.length() + 1][][];
        table[0] = new String[][]{{}};

        for(int ix = 0; ix < word.length(); ix++){
            if (table[ix] == null)
                continue;

            String substring = word.substring(ix, word.length());
            for (String w : wordBank) {
                if (substring.startsWith(w) && (ix + w.length()) < table.length){
                    // add w to every comb in curr pos and put it in new pos
                    String[][] newComb = appendToEachComb(table[ix], w);
                    table[ix + w.length()] = merge(table[ix + w.length()], newComb);
                }
            }
        }        
        return table[table.length - 1];
    }

    private static String[][] appendToEachComb(String[][] combs, String w) {
        String[][] newCombs = new String[combs.length][];
        for(int ix = 0; ix < combs.length; ix++){
            newCombs[ix] = append(combs[ix], w);
        }
        return newCombs;
    }

    private static String[] append(String[] comb, String w) {
        String[] newComb = new String[comb.length + 1];
        for(int ix = 0; ix < comb.length; ix++){
            newComb[ix] = comb[ix];
        }
        newComb[comb.length] = w;
        return newComb;
    }

    
    private static String[][] merge(String[][] left, String[][] right) {
        if (left == null)
            return right;
        if (right == null)
            return left;

        String[][] newArr = new String[left.length + right.length][];
        int counter = 0;

        for (String[] v : left)
            newArr[counter++] = v;

        for (String[] v : right)
            newArr[counter++] = v;

        return newArr;
    }
   
}
