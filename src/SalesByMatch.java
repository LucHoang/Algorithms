package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) {
        Integer[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        List<Integer> ar = new ArrayList<>(Arrays.asList(array));
        System.out.println(sockMerchant(9, ar));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        int cnt=0;
        for (int i=ar.size()-1; i>=1; i--) {
            for (int j=i-1; j>=0; j--) {
                if (ar.get(i) == ar.get(j)) {
                    cnt++;
                    ar.remove(j);
                    i--;
                    break;
                }
            }
        }
        return cnt;
    }
}
