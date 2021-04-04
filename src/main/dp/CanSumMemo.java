package main.dp;

import java.util.HashMap;
import java.util.Map;

public class CanSumMemo {
    public static boolean run(Integer sum, Integer[] values){
        Map<Integer, Boolean> mapping = new HashMap<>();
        return canSum(sum, values, mapping);
    }

    private static Boolean canSum(Integer sum, Integer[] values, Map<Integer, Boolean> mapping) {
       
        Boolean cachedValue = mapping.get(sum);
        if (cachedValue != null)
            return cachedValue;

        if (sum == 0){
            return true;
        }

        if (sum < 0){
            return false;
        }

        for(Integer v : values){
            Integer newSum = sum - v;
            if (canSum(newSum, values, mapping)){
                mapping.put(sum, true);
                return true;
            }
        }
        mapping.put(sum, false);
        return false;
    }
}
