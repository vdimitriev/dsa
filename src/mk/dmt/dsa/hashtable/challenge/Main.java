package mk.dmt.dsa.hashtable.challenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("E1", "EE1", 1);
        Employee e2 = new Employee("E2", "EE2", 2);
        Employee e3 = new Employee("E3", "EE3", 3);
        Employee e4 = new Employee("E4", "EE4", 4);
        Employee e5 = new Employee("E5", "EE5", 5);


        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e4);

        employees.forEach(System.out::println);

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            }
            employeeTable.put(employee.getId(), employee);
        }

        for(Employee employee : remove) {
            employees.remove(employee);
        }

        System.out.println("-----------");
        employeeTable.values().forEach(System.out::println);
    }
}
