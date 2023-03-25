package src;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        //Code test
    }
    public static void extraLongFactorials(int n) {
        BigInteger result = new BigInteger("1");
        while (n>0) {
            result = result.multiply(new BigInteger(Integer.toString(n)));
            n--;
        }
        System.out.println(result);
    }
}
