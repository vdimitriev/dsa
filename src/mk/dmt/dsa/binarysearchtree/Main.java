package mk.dmt.dsa.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
        System.out.println(intTree.getNode(29));
        System.out.println(intTree.getNode(27));
        System.out.println(intTree.getNode(5555));

        System.out.println("Min = " + intTree.min());
        System.out.println("Max = " + intTree.max());
    }
}
