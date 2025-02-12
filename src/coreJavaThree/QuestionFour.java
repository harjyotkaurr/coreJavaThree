//QUESTION 4:Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

        list.sort((a, b) -> {
            if (b.getValue().equals(a.getValue())) {
                return 0;
            } else {
                return b.getValue() - a.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

