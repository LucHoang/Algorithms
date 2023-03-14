package src;

import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        //Code test
    }

    public static int pickingNumbers(List<Integer> a) {
        int max=0;
        for (int i=0; i<a.size(); i++) {
            int cntmore=0;
            int cntLess=0;
            int vl = a.get(i);
            for(int j=0; j<a.size(); j++) {
                if ( Math.abs(vl-a.get(j))<=1 && vl<a.get(j) ) {
                    cntmore++;
                } else if (Math.abs(vl-a.get(j))<=1 && vl>=a.get(j)) {
                    cntLess++;
                }
            }
            max = Math.max(Math.max(cntLess, cntmore), max);

        }
        return max;
    }
}
