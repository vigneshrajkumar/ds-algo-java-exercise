package main.dp;


public class CanSumTab {
    public static boolean run(Integer sum, Integer[] values){

        Boolean[] table = new Boolean[sum + 1];

        table[0] = true;

        for(int ix = 0; ix < table.length; ix++){
            if (table[ix] != null && table[ix]){
                for(int v : values){
                    if (v + ix < table.length){
                        table[v + ix] = true;
                    }
                }
            }
        }
    
        return table[table.length - 1] == null ? false : table[table.length - 1];
    }
}
