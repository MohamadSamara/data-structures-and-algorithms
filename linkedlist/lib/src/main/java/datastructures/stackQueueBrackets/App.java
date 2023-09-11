package datastructures.stackQueueBrackets;
public class App {

    public static void main(String[] args) {

        StackQueueBrackets stackQueueBrackets = new StackQueueBrackets();

        System.out.println(stackQueueBrackets.validateBrackets("{}")); // true
        System.out.println(stackQueueBrackets.validateBrackets("{}(){}")); // true
        System.out.println(stackQueueBrackets.validateBrackets("()[[Extra Characters]]")); // true
        System.out.println(stackQueueBrackets.validateBrackets("(){}[[]]")); // true
        System.out.println(stackQueueBrackets.validateBrackets("{}{Code}[Fellows](())")); // true
        System.out.println(stackQueueBrackets.validateBrackets("[({}]")); // false
        System.out.println(stackQueueBrackets.validateBrackets("(](")); // false
        System.out.println(stackQueueBrackets.validateBrackets("([{(})])")); // false

    }
}
