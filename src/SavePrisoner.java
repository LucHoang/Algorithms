package src;

public class SavePrisoner {
    public static void main(String[] args) {
        //Code test
    }
    public static int saveThePrisoner(int n, int m, int s) {
        int result =  (m  + s - 1) % n;
        return result == 0 ? n : result;
    }
}
