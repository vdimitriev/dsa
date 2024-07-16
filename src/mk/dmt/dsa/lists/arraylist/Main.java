package mk.dmt.dsa.lists.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.forEach(System.out::println);
        employeeList.set(1, new Employee("John", "Adams", 4568));
        System.out.println("-------------------");
        employeeList.forEach(System.out::println);
        employeeList.add(3, new Employee("John", "Doe", 4567));
        System.out.println("-------------------");
        employeeList.forEach(System.out::println);
        System.out.println("-------------------");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println("-------------------");
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
        employeeList.remove(2);
    }
}