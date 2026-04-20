import java.util.Scanner;

public class StackArray {

    static int[] stack = new int[100];
    static int top = -1;

    static void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = val;
        System.out.println(val + " pushed");
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(stack[top--] + " popped");
    }

    static void peek() {
        if (top == -1) System.out.println("Stack is empty");
        else System.out.println("Top: " + stack[top]);
    }

    static void display() {
        if (top == -1) { System.out.println("Stack is empty"); return; }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        push(10); push(20); push(30);
        display();
        peek();
        pop();
        display();
    }
}