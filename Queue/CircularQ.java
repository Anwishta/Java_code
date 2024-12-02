package Queue;

public class CircularQ {
    static class Queue {
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!! Nothing to remove...");
                return -1;
            }
            int data = arr[front];
            if (front == rear) {
                // Reset front and rear when the queue becomes empty
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return data;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!! Nothing to peek...");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove()); // Output: 1
        System.out.println(q.remove()); // Output: 2

        q.add(6);
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.remove()); // Outputs remaining elements in order
        }
    }
}
