//QUESTION 1:
// Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.



package coreJavaThree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class QuestionOne {

        public static void main(String[] args) {

            List<Float> q1 = new ArrayList<>();
            q1.add(7.7f);
            q1.add(2.2f);
            q1.add(12.2f);
            q1.add(8.1f);
            q1.add(5.1f);

            Iterator<Float> iterator = q1.iterator();
            float sum = 0.0f;

            while (iterator.hasNext()) {
                sum += iterator.next();
            }
            System.out.println("Sum of numbers is: " + sum);
        }


}
