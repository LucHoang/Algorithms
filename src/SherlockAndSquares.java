package src;

public class SherlockAndSquares {
    public static void main(String[] args) {
        //Code test
    }
    public static int squares(int a, int b) {
        int num1 = (int) Math.ceil(Math.sqrt(a)); int num2 = (int) Math.floor(Math.sqrt(b));
        return num2 - num1 +1;
    }
}
