package main.dp;

public class BestSumTab {

    public static Integer[] run(Integer sum, Integer[] values) {

        Integer[][] table = new Integer[sum + 1][];
        table[0] = new Integer[] {};

        for (int ix = 0; ix < table.length; ix++) {
            if (table[ix] != null) {

                for (Integer v : values) {
                    if (ix + v < table.length) {
                        Integer[] newComb = append(table[ix], v);
                        if (table[ix + v] == null || newComb.length < table[ix + v].length) {
                            table[ix + v] = newComb;
                        }
                    }
                }
            }
        }

        return table[table.length - 1];
    }

    private static Integer[] append(Integer[] res, Integer v) {
        Integer[] newRes = new Integer[res.length + 1];
        for (int ix = 0; ix < res.length; ix++)
            newRes[ix] = res[ix];
        newRes[res.length] = v;
        return newRes;
    }
}
