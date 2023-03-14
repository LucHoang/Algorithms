package src;

public class DrawingBook {
    public static void main(String[] args) {
        //Code test
    }

    public static int pageCount(int n, int p) {
        n = n % 2 == 0 ? ++n : n;
        p = p % 2 == 0 ? ++p : p;
        int left = (p - 1) / 2;
        int right = (n - p) / 2;
        return Math.min(left, right);
    }
}
