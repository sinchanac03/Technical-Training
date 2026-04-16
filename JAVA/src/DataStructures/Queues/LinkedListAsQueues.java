package DataStructures.Queues;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListAsQueues {
    Node front, rear;

    LinkedListAsQueues() {
        front = null;
        rear = null;
    }

    void push(int val) {
        Node newNode = new Node(val);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        // Add at the end
        rear.next = newNode;
        rear = newNode;
    }

    void pop() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        // Move front forward
        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    int peek() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }
}

class Driver1 {
    public static void main(String[] args) {
        LinkedListAsQueues q = new LinkedListAsQueues();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        q.pop();

        System.out.println(q.isEmpty());
    }
}