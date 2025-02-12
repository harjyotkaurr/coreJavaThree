//QUESTION 2; Given the following class Employee class{ Double Age; Double Salary; String Name} Design the class in such a way that the default sorting should work on firstname and lastname. Also, Write a program to sort Employee objects based on salary using Comparator.


package coreJavaThree;
import java.util.*;

class Employee implements Comparable<Employee> {
    Double Age;
    Double Salary;
    String Name;

    public Employee(Double age, Double salary, String name) {
        this.Age = age;
        this.Salary = salary;
        this.Name = name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.Name.compareTo(other.Name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Age=" + Age +
                ", Salary=" + Salary +
                ", Name='" + Name + '\'' +
                '}';
    }
}

public class QuestionTwo {
    public static void main(String[] args) {
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee i, Employee j) {
                return Double.compare(i.Salary, j.Salary);
            }
        };

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(28.0, 50000.0, "Amit Sharma"));
        employees.add(new Employee(35.0, 75000.0, "Ravi Verma"));
        employees.add(new Employee(30.0, 50000.0, "Anita Singh"));
        employees.add(new Employee(25.0, 60000.0, "Sonal Gupta"));

        Collections.sort(employees);
        System.out.println("Employees sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees, com);
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
