import java.util.Stack;

public class st_reverse_stack {
    public static void push_at_bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        push_at_bottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        
            int top = s.pop();
            reverseStack(s);
            push_at_bottom(s, top);
        }
    

    public static void print(Stack<Integer> s) {
        Stack<Integer> tempStack = new Stack<>();
        while (!s.isEmpty()) {
            
            int element = s.pop();
            System.out.println(element);
            tempStack.push(element);
        }
        // Restoring the original stack
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }
    

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack:");
        print(s); // Print the original stack before reversal
        reverseStack(s);
        System.out.println("Reversed Stack:");
        print(s); // Print the reversed stack
    }
}
