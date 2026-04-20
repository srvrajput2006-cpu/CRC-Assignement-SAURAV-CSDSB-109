public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; prev = null; next = null; }
    }

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    static void delete(int data) {
        if (head == null) { System.out.println("List is empty"); return; }
        Node temp = head;
        while (temp != null && temp.data != data)
            temp = temp.next;
        if (temp == null) { System.out.println("Not found"); return; }
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    static void displayForward() {
        Node temp = head;
        System.out.print("Forward:  ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void displayBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert(10); insert(20); insert(30); insert(40);
        displayForward();
        displayBackward();

        delete(20);
        System.out.print("After deleting 20: ");
        displayForward();
    }
}