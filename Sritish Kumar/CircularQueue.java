public class CircularQueue {
    int front = -1;
    int rear = -1;

    int[] queue;

    public CircularQueue(int size) {
        queue = new int[size];
    }

    public boolean isFull() {
        if ((front == 0 && rear == queue.length - 1) || front == rear + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // Dequeue
    public void insert(int item) {
        if (isFull()) {
            throw new Error("Queue Overflow");

        }
        // Empty Queue
        if (front == -1) {
            front++;
        }

        if (front != 0 && rear == queue.length - 1) {
            rear = -1;
        }
        rear++;
        queue[rear] = item;

    }

    public void print() {
        System.out.println("Front: " + front);
        System.out.println("Rear: " + rear);
        System.out.println();
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + "-> ");
            }

        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.print(queue[i] + "-> ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + "-> ");

            }
        }
        System.out.println();

    }

    public void delete() {
        if (isEmpty()) {
            throw new Error("Queue Underflow");
        }
        if (front == rear) {
            front = -1;
            rear = -1;

        } else if (front == queue.length && rear < front) {
            front = 0;
        } else {
            front++;
        }

    }
}
