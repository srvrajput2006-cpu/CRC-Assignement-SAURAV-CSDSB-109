public class StackLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node top = null;

    static void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed");
    }

    static void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(top.data + " popped");
        top = top.next;
    }

    static void peek() {
        if (top == null) System.out.println("Stack is empty");
        else System.out.println("Top: " + top.data);
    }

    static void display() {
        if (top == null) { System.out.println("Stack is empty"); return; }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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