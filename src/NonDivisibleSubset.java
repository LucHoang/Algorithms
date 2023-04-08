package src;

import java.util.List;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
    /* MODULOS RULES
        * - (A+B)%K = 0 IF (A%K) + (B%K) = K
        * First case - If s[i]]%K = 0; you can just add one of the numbers
        * Second case - If s[i]%K = K/2 && if K is even; you can just add one of the numbers
        * Third Case - If s[i]%K + s[k-i]%K = K; pick the one with more frecuecy as
            per problem definition
        * Return the sum of the frecuency on each index (represinting the longest subset)*/

        // each index represent the possible remainders from 0 to k
        int [] frecuencyRems = new int[k];
        int tempRem = 0;

        for (int i = 0; i <s.size(); i++){
            // remainder of each number in s
            tempRem = s.get(i)%k;
            // add one counter at that position
            frecuencyRems[tempRem] ++;
        }

        // if we have more than one case of s[i]% k we set it to one
        // as per modulos rules we can just have one
        if (frecuencyRems[0] > 1) frecuencyRems[0] = 1;

        // same here, as per modulos rules we just can have one
        if ( k%2 == 0 && frecuencyRems[k/2] > 1) frecuencyRems[k/2] = 1;

        // as third case we stay with the biggest by setting the
        // the counter of the smallest to 0
        for(int i = 1; i < k; i++){
            if(frecuencyRems[i] > frecuencyRems[k-i]){
                frecuencyRems[k-i] = 0;
            } else if (k%2 != 0){
                frecuencyRems[i] = 0;
            }
        }

        int result = 0;

        for(int i : frecuencyRems){
            result += i;
        }
        return result;
    }
}
