//QUESTION 3: Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value and perform reverse sorting of salary with the help of Comparator.

package coreJavaThree;

import java.util.*;


    class Employee2{
        String name;
        int age;
        String designation;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee2 employee = (Employee2) o;
            return age == employee.age &&
                    Objects.equals(name, employee.name) &&
                    Objects.equals(designation, employee.designation);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, designation);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", designation='" + designation + '\'' +
                    '}';
        }

        public Employee2(String name, int age, String designation) {
            this.name = name;
            this.age = age;
            this.designation = designation;
        }
    }

public class QuestionThree {
        public static void main(String[] args){
            Map<Employee2, Double> employeeSalaryMap = new HashMap<>();
            employeeSalaryMap.put(new Employee2("Amit Sharma", 28, "Developer"), 50000.0);
            employeeSalaryMap.put(new Employee2("Ravi Verma", 35, "Manager"), 75000.0);
            employeeSalaryMap.put(new Employee2("Anita Singh", 30, "Analyst"), 60000.0);
            employeeSalaryMap.put(new Employee2("Sonal Gupta", 25, "Tester"), 45000.0);

            List<Map.Entry<Employee2, Double>> sortedEntries = new ArrayList<>(employeeSalaryMap.entrySet());

            sortedEntries.sort(new Comparator<Map.Entry<Employee2, Double>>() {
                @Override
                public int compare(Map.Entry<Employee2, Double> e1, Map.Entry<Employee2, Double> e2) {
                    return e2.getValue().compareTo(e1.getValue());
                }
            });


            System.out.println("Employees sorted by Salary (Reverse order):");
            for (Map.Entry<Employee2, Double> entry : sortedEntries) {
                System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
            }
        }


}
