package src;

import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        //Code test
    }
    public static String angryProfessor(int k, List<Integer> a) {
        int cnt=0;
        for (Integer e: a) {
            cnt = e<=0?++cnt:cnt;
        }
        return cnt<k?"YES":"NO";
    }
}
