package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        //Code test
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int cnt=0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if( (ar.get(i)+ar.get(j))%k == 0 ) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
