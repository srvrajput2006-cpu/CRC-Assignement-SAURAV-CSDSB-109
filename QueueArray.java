public class QueueArray {

    static int[] queue = new int[100];
    static int front = -1, rear = -1;

    static void enqueue(int val) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = val;
        System.out.println(val + " enqueued");
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(queue[front++] + " dequeued");
    }

    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10); enqueue(20); enqueue(30);
        display();
        dequeue();
        display();
        enqueue(40);
        display();
    }
}