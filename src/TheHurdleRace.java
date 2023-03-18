package src;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        //Code test
    }
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);
        return k>height.get(height.size()-1)?0:Math.abs(k-height.get(height.size()-1));
    }
}
