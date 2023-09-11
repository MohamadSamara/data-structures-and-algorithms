package datastructures.stackQueueBrackets;
import datastructures.stack.Stack;

public class StackQueueBrackets {
    public static boolean validateBrackets(String inputStr) {

        Stack<Character> stack = new Stack<>();

        for (char current : inputStr.toCharArray()) {
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else if (current == '}' || current == ']' || current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if ((current == '}' && topChar != '{') || (current == ']' && topChar != '[') || (current == ')' && topChar != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}

