import java.util.Scanner;

public class BalancedParentheses {

    static char[] stack = new char[100];
    static int top = -1;

    static void push(char c) { stack[++top] = c; }

    static char pop() {
        if (top == -1) return '\0';
        return stack[top--];
    }

    static boolean isBalanced(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char t = pop();
                if (c == ')' && t != '(') return false;
                if (c == '}' && t != '{') return false;
                if (c == ']' && t != '[') return false;
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String s = sc.nextLine();

        if (isBalanced(s))
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
    }
}