package src;

public class BeautifulDays {
    public static void main(String[] args) {
        //Code test
    }
    public static int beautifulDays(int i, int j, int k) {
        int cnt=0;
        while (i<=j) {
            int reverse=0;
            int temp=i;
            while (temp!=0) {
                int remain = temp%10;
                reverse = reverse*10 + remain;
                temp = temp/10;
            }
            cnt = Math.abs(i-reverse)%k==0?++cnt:cnt;
            i++;
        }
        return cnt;
    }
}
