package src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillDivision {
    public static void main(String[] args) {
        //Code test
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        for (int i=0; i<bill.size(); i++) {
            if (i==k) continue;
            sum += bill.get(i);
        }
        int result = Math.abs(sum/2 - b);
        System.out.println(result==0?"Bon Appetit": result);
    }
}
