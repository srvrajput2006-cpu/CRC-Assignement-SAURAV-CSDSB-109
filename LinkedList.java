public class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
    static Node head = null;
    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    static void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data)
            temp = temp.next;
        if (temp.next == null)
            System.out.println("Element not found");
        else
            temp.next = temp.next.next;
    }
    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        System.out.print("After insert: ");
        display();
        delete(20);
        System.out.print("After deleting 20: ");
        display();
        delete(99);
    }
}