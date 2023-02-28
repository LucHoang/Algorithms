package src;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static void main(String[] args) {
        //Code test

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxCnt=0;
        int minCnt=0;
        int max=scores.get(0);
        int min=scores.get(0);
        for (int i=1; i<scores.size(); i++) {
            if(scores.get(i)>max) {
                maxCnt++;
                max=scores.get(i);
            } else if(scores.get(i)<min) {
                minCnt++;
                min=scores.get(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxCnt);
        result.add(minCnt);
        return result;
    }
}
