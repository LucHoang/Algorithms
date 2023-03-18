package src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        //Code test
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        char c;
        String[] wordArr= word.split("");
        Map<String, Integer> map = new HashMap<>();
        int i=0;
        for (c='a'; c<='z'; c++) {
            map.put(String.valueOf(c),h.get(i));
            i++;
        }
        int max = 0;
        for (int j=0; j<wordArr.length; j++) {
            max=Math.max(map.get(wordArr[j]), max);
        }
        return max * wordArr.length;
    }
}
