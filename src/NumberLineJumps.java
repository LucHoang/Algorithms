package src;

public class NumberLineJumps {
    public static void main(String[] args) {
        //Code test
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        while (x1<x2) {
            x1 += v1;
            x2 += v2;
        }
        if(x1==x2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
