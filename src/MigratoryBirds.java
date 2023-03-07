package src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        //Code test
    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> chkMap = new HashMap<>();
        int maxValue = 1;
        int indexMax = 0;
        for( int i=0; i<arr.size(); i++ ) {
            if (chkMap.containsKey(arr.get(i))) {
                chkMap.replace( arr.get(i), chkMap.get(arr.get(i))+1 );
                if (chkMap.get(arr.get(i))>maxValue) {
                    maxValue = chkMap.get(arr.get(i));
                    indexMax = i;
                } else if ( chkMap.get(arr.get(i)) == maxValue ) {
                    indexMax = arr.get(indexMax)>arr.get(i)? i: indexMax;
                }
            } else {
                chkMap.put(arr.get(i), 1);
            }
        }
        return arr.get(indexMax);
    }
}
