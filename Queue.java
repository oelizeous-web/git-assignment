public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public Queue() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        queue[rear] = data;
        size++;
    }

    public void show() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}