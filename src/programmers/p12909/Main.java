package programmers.p12909;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        return stack.isEmpty();
    }
}
