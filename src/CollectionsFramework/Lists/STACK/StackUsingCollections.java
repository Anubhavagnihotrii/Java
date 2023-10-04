package CollectionsFramework.Lists.STACK;

import java.util.Stack;

public class StackUsingCollections {
    public static void main(String[] args) {

        // The Stack is a data structure that follows the LIFO order, which means Last In First Out.

        Stack<String> stk = new Stack<>();
        stk.push("Apple"); // Use the push method to add an element to the stack.
        stk.push("Mango");
        stk.push("Pineapple");
        stk.push("Banana");

        System.out.println("Stack elements are: " + stk);

        System.out.println("Top element in the Stack is -> " + stk.peek());
        // The peek method is used to see the topmost element of the stack. When elements are popped, the top element is removed first (LIFO).

        stk.pop(); // The pop method is used to remove the top-most element from the stack.
        System.out.println("After popping the element, now the top element is -> " + stk.peek());
    }
}
