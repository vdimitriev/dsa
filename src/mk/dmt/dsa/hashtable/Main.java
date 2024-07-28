package mk.dmt.dsa.hashtable;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("E1", "EE1", 1);
        Employee e2 = new Employee("E2", "EE2", 2);
        Employee e3 = new Employee("E3", "EE3", 3);
        Employee e4 = new Employee("E4", "EE4", 4);
        Employee e5 = new Employee("E5", "EE5", 5);

        SimpleHashTable sht = new SimpleHashTable();
        sht.put("E1", e1);
        sht.put("EEE2", e2);
        sht.put("EEEE3", e3);
        sht.put("E4", e4);
        sht.put("EEE5", e5);

        sht.printHashTable();

        System.out.println("Retrieve key Wilson: " + sht.get("EEE2"));
    }
}
