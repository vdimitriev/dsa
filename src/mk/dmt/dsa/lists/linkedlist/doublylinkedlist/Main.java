package mk.dmt.dsa.lists.linkedlist.doublylinkedlist;


public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("E1", "EE1", 1);
        Employee e2 = new Employee("E2", "EE2", 2);
        Employee e3 = new Employee("E3", "EE3", 3);
        Employee e4 = new Employee("E4", "EE4", 4);
        Employee e5 = new Employee("E5", "EE5", 5);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(e1);
        list.addToFront(e2);
        list.addToFront(e3);
        list.addToFront(e4);
        list.addToEnd(e5);

        list.printList();
    }
}
