package src;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TimeConversion {

    public static void main(String[] args) throws IOException {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));

    }

    public static String timeConversion(String s) {
        // Write your code here
        // if AM
        // 12 -> 00
        // if PM
        // 01 -> 13
        String[] pm = {"01","02","03","04","05","06","07","08","09","10","11"};
        String[] h24 = {"13","14","15","16","17","18","19","20","21","22","23"};
        Map<String, String> converMap = new HashMap<>();
        for (int i=0;i<pm.length;i++) {
            converMap.put(pm[i], h24[i]);
        }
        String type = s.substring(8);
        String startH = s.substring(0, 2);
        String result = s;
        if("AM".equals(type)) {
            if(startH.equals("12")) {
                result = s.replace("12", "00");
            }
            return result.substring(0,8);
        } else {

            if(converMap.containsKey(startH)) {
                result.replace(startH, converMap.get(startH));
            }
            return result.substring(0,8);
        }
    }
}
