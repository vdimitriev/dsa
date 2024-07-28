package mk.dmt.dsa.stack.palindrom;

import java.util.LinkedList;

public class Palindrom {

    public static void main(String[] args) {
        String input = "I did, did I?";
        StringBuilder stringNoPunctuations = new StringBuilder(input.length());
        String lowerCase = input.toLowerCase();
        char[] chars = input.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        for(int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                stack.push(c);
                stringNoPunctuations.append(c);
            }
        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        boolean isPalindrom = stringNoPunctuations.compareTo(reversedString) == 0;
        System.out.println(isPalindrom);
    }
}
