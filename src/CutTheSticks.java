package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        //Code test
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        int min = 0;
        for (int i=0; i<arr.size(); i++) {
            if(min != arr.get(i)) {
                result.add(arr.size()-i);
                min = arr.get(i);
            }
        }
        return result;
    }
}
