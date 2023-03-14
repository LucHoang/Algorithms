package src;

public class CountingValleys {
    public static void main(String[] args) {
        //Code test
    }

    public static int countingValleys(int steps, String path) {
        int current = 0;
        int vCount = 0;
        String[] ar = path.split("");
        for(int i =0; i<ar.length; i++){
            if(ar[i].equals("U")){
                current++;
                if(current == 0)
                    vCount++;
            }else{
                current--;
            }
        }
        return vCount;
    }
}
