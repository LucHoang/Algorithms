package src;

import java.util.List;

public class FormingMagicSquare {
    public static void main(String[] args) {
        //Code test
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSquare = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}}, {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < magicSquare.length; i++) {
            int cost = 0;
            for (int j = 0; j < s.size(); j++) {
                for (int k = 0; k < s.get(j).size(); k++) {
                    if (s.get(j).get(k) != magicSquare[i][j][k]) {
                        cost += Math.abs(s.get(j).get(k) - magicSquare[i][j][k]);
                    }
                }
            }
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}
