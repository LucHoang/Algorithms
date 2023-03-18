package src;

public class UtopianTree {
    public static void main(String[] args) {
        //Code test
    }
    public static int utopianTree(int n) {
        int cnt = 1;
        for (int i=1; i<=n; i++) {
            cnt = i%2==0?cnt+1:cnt*2;
        }
        return cnt;
    }
}
