package Custom;

class Q {
    int front, rear, size, capacity;
    int[] ele;

    public Q(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        ele = new int[this.capacity];

    }

    void enqueue(int x) {
        if (this.size == this.capacity)
            return;
        ;
        rear = (rear + 1) % capacity;
        ele[rear] = x;
        size += 1;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("underflow");
            return -1;
        }
        int x = ele[front];
        front = (front + 1) % capacity;
        size = size - 1;
        return x;
    }

    int peek() {
        if (size == 0) {
            System.out.println("underflow");
            return -1;
        }
        return ele[front];
    }
}

public class CustQueue {
    public static void main(String[] args) {
        Q q = new Q(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);;
        System.out.println(q.dequeue());
        System.out.println(q.peek());


}
}
