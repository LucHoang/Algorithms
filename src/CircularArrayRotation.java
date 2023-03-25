package src;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        //Code test
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<k; i++) {
            int elementLast = a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0,elementLast);
        }
        for (int i=0; i<queries.size(); i++) {
            result.add(a.get(queries.get(i)));
        }

        return result;
    }
}
