package src;

public class LibraryFine {
    public static void main(String[] args) {
        //Code test
    }
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        return y1 > y2 ? 10000 : y1 == y2 && m1 > m2 ? (m1 - m2) * 500 :
                y1 == y2 && m1 == m2 && d1 > d2 ? (d1 - d2) * 15 : 0;
    }
}
