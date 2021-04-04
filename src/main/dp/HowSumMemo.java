package main.dp;

import java.util.HashMap;
import java.util.Map;

public class HowSumMemo {

    public static Integer[] run(Integer sum, Integer[] values) {
        Map<Integer, Integer[]> mapping = new HashMap<>();
        return runner(sum, values, mapping);
    }

    private static Integer[] runner(Integer sum, Integer[] values, Map<Integer, Integer[]> mapping) {
        Integer[] cachedValue = mapping.get(sum);
        if (cachedValue != null)
            return cachedValue;
        
        if (sum == 0)
            return new Integer[]{};

        if (sum < 0)
            return null;

        for(Integer v : values){
            Integer newSum = sum - v;
            Integer[] res = runner(newSum, values, mapping);
            if (res != null){
                res = append(res, v);
                mapping.put(sum, res);
                return res;
            }
        }       
        mapping.put(sum, null);
        return null;
    }

    private static Integer[] append(Integer[] res, Integer v) {
        Integer[] newRes = new Integer[res.length + 1];
        for (int ix = 0; ix < res.length; ix++)
            newRes[ix] = res[ix];
        newRes[res.length] = v;
        return newRes;
    }

}
