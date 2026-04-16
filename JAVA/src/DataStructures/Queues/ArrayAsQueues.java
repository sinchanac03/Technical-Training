package DataStructures.Queues;



public class ArrayAsQueues
{
    int[] arr;
    int front, back, size;
    ArrayAsQueues(int size)
    {
        this.size=size;
        front=-1;
        back=-1;
        arr=new int[size];
    }
    void push(int val)
    {
        if(back==size-1)
        {
            System.out.println("Queue Overflown");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1)
        {
            front++;
        }
    }
    void pop()
    {
        if(front==-1||front>back)
        {
            System.out.println("Queue Underflow");
            return;
        }
        arr[front]=0; //optional
        front++;
    }
    int Peek()
    {
        if(front==-1||front>back)
        {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty()
    {
        return (front==-1 || front>back);
    }
}
class Driver{
    public static void main(String[] args) {
        ArrayAsQueues q=new ArrayAsQueues(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println(q.Peek());
        q.pop();
        System.out.println(q.Peek());
        q.pop();
        System.out.println(q.Peek());
        q.pop();
        System.out.println(q.Peek());
        q.pop();
        System.out.println(q.Peek());
        q.pop();

        System.out.println(q.isEmpty());
    }
}

