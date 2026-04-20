public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert(1); insert(2); insert(3); insert(4); insert(5);
        System.out.print("Original: ");
        display();
        reverse();
        System.out.print("Reversed: ");
        display();
    }
}