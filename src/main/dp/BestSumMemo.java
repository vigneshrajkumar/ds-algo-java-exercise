package main.dp;

import java.util.HashMap;
import java.util.Map;

public class BestSumMemo {
    public static Integer[] run(Integer sum, Integer[] values){
        
        Map<Integer, Integer[]> mapping = new HashMap<>();
        
        return runner(sum, values, mapping);
    }
    
    private static Integer[] append(Integer[] res, Integer v) {
        Integer[] newRes = new Integer[res.length + 1];
        for (int ix = 0; ix < res.length; ix++)
            newRes[ix] = res[ix];
        newRes[res.length] = v;
        return newRes;
    }

    private static Integer[] runner(Integer sum, Integer[] values, Map<Integer, Integer[]> mapping) {
        Integer[] cachedValue = mapping.get(sum);
        if (cachedValue != null)
            return cachedValue;
            
        if (sum == 0)
            return new Integer[]{};

        if (sum < 0)
            return null;

        Integer[] comb = null;
        
        for(int v : values){
            int newSum = sum - v;
            Integer[] res = runner(newSum, values, mapping);
            if (res != null){
                res = append(res, v);
                if (comb == null || res.length < comb.length)
                    comb = res;
            }
        }
        mapping.put(sum, comb);
        return comb;
    }
}
