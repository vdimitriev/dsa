package mk.dmt.dsa.lists.linkedlist.jdklinkedlist;


import mk.dmt.dsa.lists.linkedlist.doublylinkedlist.EmployeeDoublyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("E1", "EE1", 1);
        Employee e2 = new Employee("E2", "EE2", 2);
        Employee e3 = new Employee("E3", "EE3", 3);
        Employee e4 = new Employee("E4", "EE4", 4);
        Employee e5 = new Employee("E5", "EE5", 5);
        Employee e6 = new Employee("E6", "EE6", 6);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(e1);
        list.addFirst(e2);
        list.addFirst(e3);
        list.addFirst(e4);
        list.addLast(e5);
        list.add(e6);

        Iterator<Employee> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
    }
}
