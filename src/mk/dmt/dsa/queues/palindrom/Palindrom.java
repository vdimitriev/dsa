package mk.dmt.dsa.queues.palindrom;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Palindrom {

    public static void main(String[] args) {
        String input = "I did, did I?";
        StringBuilder stringNoPunctuations = new StringBuilder(input.length());
        String lowerCase = input.toLowerCase();
        char[] chars = input.toCharArray();
        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                list.push(c);
                stringNoPunctuations.append(c);
            }
        }

        boolean isPalindrom = true;
        while(!list.isEmpty()) {
            Character first = getFirst(list);
            Character last = getLast(list);
            if(last == null) {
                break;
            }
            if(first != last) {
                isPalindrom = false;
                break;
            }
        }

//        StringBuilder reversedString = new StringBuilder(list.size());
//        while(!list.isEmpty()) {
//            reversedString.append(list.pop());
//        }
//        boolean isPalindrom = stringNoPunctuations.compareTo(reversedString) == 0;
        System.out.println(isPalindrom);
        System.out.println(secondTry());
    }

    private static Character getLast(LinkedList<Character> list) {
        try {
            return list.removeLast();
        }catch (NoSuchElementException exception) {
            return null;
        }
    }

    private static Character getFirst(LinkedList<Character> list) {
        try {
            return list.removeFirst();
        }catch (NoSuchElementException exception) {
            return null;
        }
    }

    private static boolean secondTry() {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();

        String input = "I did, did I?";
        String lowerCase = input.toLowerCase();
        int size = 0;
        for(int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
                size++;
            }
        }

        for(int i = 0; i < size; i++) {
            if(!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
