package DataStructures.Queues.PriorityQueues;

class Item{
    int value; // actual value
    int priority; // priority attached to the value

    Item(int value, int priority){
        this.value = value;
        this.priority = priority;
    }
}

public class PriorityQueueArray {
    Item [] PQarr; // array to store the elements
    int PQsize; // size of the PQ

    PriorityQueueArray(int capacity){
        PQarr = new Item[capacity];
        PQsize = -1;
    }

    void push(int value, int priority){
        PQsize++;
        PQarr[PQsize] = new Item(value, priority);
    }

    int peek(){
        int highestPriority = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0; i<=PQsize; i++){
            // case 1---> same priority
            if(highestPriority==PQarr[i].priority &&
                    PQarr[index].value < PQarr[i].value){
                highestPriority = PQarr[i].priority;
                index = i;
            }
            // case 2---> Unique Priority
            else if(highestPriority < PQarr[i].priority){
                highestPriority = PQarr[i].priority;
                index = i;
            }
        }
        return index;
    }

    void pop(){
        // Index of element with the highest priority
        int index = peek();

        // shifting all the elements from that index towards left
        for(int i=index; i<PQsize; i++){
            PQarr[i] = PQarr[i+1];
        }
        PQsize--;
    }

    void display(){
        for(int i=0; i<=PQsize; i++){
            System.out.println("Value:" + PQarr[i].value +
                    " Priority:" + PQarr[i].priority);
        }
        System.out.println("---------");
    }
}

class Driver{
    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray(100);
        pq.push(10, -2);
        pq.push(20, 10);
        pq.push(30, 4);
        pq.push(40, 6);
        pq.push(50, 8);
        pq.push(60, 20);
        pq.push(70, 4);

        pq.display();

        // peek on Top Element
        int ind = pq.peek();
        System.out.println("Top ELement: " + pq.PQarr[ind].value);

        // Remove Top ELement
        pq.pop();
        // peek on Top Element
        ind = pq.peek();
        System.out.println("Top ELement: " + pq.PQarr[ind].value);
    }
}