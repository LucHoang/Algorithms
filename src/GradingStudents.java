package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        // Call test
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> resultList = new ArrayList<>();
        for (int e: grades) {
            if (e<38) {
                resultList.add(e);
            } else {
                int surPlus = e%5;
                resultList.add(5-surPlus<3?e+5-surPlus:e);
            }
        }
        return resultList;
    }
}
