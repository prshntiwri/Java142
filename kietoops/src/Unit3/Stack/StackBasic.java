package Unit3.Stack;

import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("First");
        s.push("Second");
        s.push("Third");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
