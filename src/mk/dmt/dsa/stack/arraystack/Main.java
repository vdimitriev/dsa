package mk.dmt.dsa.stack.arraystack;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("E1", "E1", 1));
        stack.push(new Employee("E2", "E2", 2));
        stack.push(new Employee("E3", "E3", 3));
        stack.push(new Employee("E4", "E4", 4));

        stack.printStack();
    }
}
