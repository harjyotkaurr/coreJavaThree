//QUESTION 5:Write a program to sort HashMap by value.

import java.lang.*;
import java.util.*;

class QuestionFive {

    static HashMap<String, Integer> sortByValue(
            HashMap<String, Integer> hm) {

        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        Collections.sort(list, (i1, i2)
                -> i1.getValue().compareTo(i2.getValue()));

        HashMap<String, Integer> temp =
                new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("A", 98);
        hm.put("B", 85);
        hm.put("C", 91);
        hm.put("D", 95);
        hm.put("E", 79);
        hm.put("F", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println(en.getKey() + ": " + en.getValue());
        }
    }
}
