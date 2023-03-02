package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        //Code test
        Integer[] arr = {2, 3, 4, 4, 2, 1, 2, 5, 3, 4, 4, 3 ,4, 1, 3, 5 ,4 ,5, 3 ,1 ,1 ,5, 4 ,3 ,5, 3, 5, 3, 4, 4, 2, 4, 5, 2, 3, 2, 5, 3, 4, 2, 4, 3, 3, 4, 3, 5, 2, 5, 1, 3, 1, 4, 2, 2, 4, 3, 3, 3, 3, 4, 1, 1, 4, 3, 1, 5 ,2 ,5 ,1 ,3 ,5 ,4 ,3 ,3 ,1, 5, 3, 3, 3, 4, 5, 2};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(birthday(list, 26, 8));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for(int i=0 ; i <= s.size() - m ; i++){
            int sum = 0;
            for(int j=0 ; j < m ; j++) {
                sum += s.get(i+j);
            }
            if(sum == d) result++;
        }
        return result;
    }
}
