package src;

public class AppendAndDelete {
    public static void main(String[] args) {
        //Code test
    }
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        // base case
        if (k >= s.length()+t.length())return "Yes";

        // 2nd base case
        int sameChars = Math.min(s.length(), t.length());

        // check number of chars are actually the same
        for (int i = 0; i < Math.min(s.length(),t.length()); i ++){
            if(s.charAt(i) != t.charAt(i)){
                sameChars = i;
                break;
            }
        }

        // find the no. of operation needed
        k -= ((s.length()-sameChars) + (t.length()-sameChars));

        // if after operations k still positive
        // and even Yes, is possible
        if(k >= 0 && k % 2 == 0) return "Yes";
        // else no
        return "No";
    }
}
