package main.dp;

public class HowSumTab {

    public static Integer[] run(Integer sum, Integer[] values) {

        Integer[][] table = new Integer[sum + 1][];
        table[0] = new Integer[] {};

        for (int ix = 0; ix < table.length; ix++) {
            Integer[] curr = table[ix];
            if (curr != null) {
                for (Integer v : values) {
                    if (ix + v < table.length){
                        table[ix + v] = append(curr, v);
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
